package com.company;

import java.util.HashMap;

/**
 * Created by qusijun on 16/3/25.
 */
public class BullsAndCows {
    public String getHint(String secret,String guess)
    {
        int BULLS = 0;
        int COWS = 0;
        HashMap map = new HashMap();
        char[] temp= new char[guess.length()];
        int j = 0;
        for (int i=0;i<secret.length();i++)
        {
            if(secret.charAt(i) == guess.charAt(i))
                BULLS++;
            else
            {

                map.put(secret.charAt(i),(int)map.getOrDefault(secret.charAt(i),0)+1);
                temp[j++] = guess.charAt(i);
            }

        }
        for(int i = 0;i<j;i++)
        {
            if (map.containsKey(temp[i]) && (int)map.get(temp[i]) > 0)
            {
                COWS++;

                map.put(temp[i],(int)map.get(temp[i])-1);
            }
        }

        String result = BULLS + "A" + COWS + "B";
        return result;
    }

    public static void main(String[] args)
    {
        HashMap map = new HashMap();
        map.put(1,2);
        map.put(1,3);
        int val = (int)map.get(1);
        map.remove(1,3);

        System.out.println(map.getOrDefault(2,1));
    }
}
