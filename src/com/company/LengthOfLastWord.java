package com.company;

/**
 * Created by qusijun on 16/3/25.
 */
public class LengthOfLastWord {
    public int lengthOfLastWord(String s)
    {
        s = s.trim();
        if (s.length() == 0)
            return 0;
        String[] strArray = s.split(" ");
        return strArray[strArray.length-1].length();
    }

}
