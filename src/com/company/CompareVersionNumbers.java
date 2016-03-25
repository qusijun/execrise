package com.company;

/**
 * Created by qusijun on 16/3/29.
 */
public class CompareVersionNumbers {
    public int compareVersion(String version1,String version2)
    {
       //version的格式如0.0.1
        String[] version1Arr = version1.split("\\.");
        String[] version2Arr = version2.split("\\.");
        int i = 0;
        int j = 0;
        //System.out.println(version1Arr.length);
        while (i < version1Arr.length && j < version2Arr.length)
        {
            //System.out.println(version1Arr[i]);
            //System.out.println(version2Arr[j]);
            if (Integer.parseInt(version1Arr[i]) > Integer.parseInt(version2Arr[j]))
                return 1;
            else if (Integer.parseInt(version1Arr[i]) < Integer.parseInt(version2Arr[j]))
                return -1;
            else
            {
                i++;
                j++;
            }
        }

        if(i == version1Arr.length && j < version2Arr.length)
        {
            for (int k = j;k<version2Arr.length;k++)
                if (Integer.parseInt(version2Arr[k]) > 0)
                    return -1;
        }

        if (j == version2Arr.length && i < version1Arr.length)
        {
            for (int k = i;k<version1Arr.length;k++)
                if (Integer.parseInt(version1Arr[k]) > 0)
                    return 1;
        }

        return 0;
    }

    public static void main(String[] args)
    {
        String version1 = "01";
        String version2 = "1";
        String[] s = version1.split("\\.");
        System.out.println(s.length);
        System.out.println(new CompareVersionNumbers().compareVersion(version1,version2));
    }

}
