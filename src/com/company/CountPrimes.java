package com.company;

/**
 * Created by qusijun on 16/3/27.
 */
public class CountPrimes {
    public int countPrimes(int n)
    {
        if (n < 2)
            return 0;
        int[] primes = new int[n];
        for(int i = 0;i<primes.length;i++)
            primes[i] = 0;
        int count = 0;
        int i = 2;
        while (i < Math.sqrt(n))
        {
            if (primes[i] == 0)
            {
                for (int j = 2;j*i < n;j++)
                {

                    primes[j*i] = 1;
                }
            }
            i++;
        }

        for (int j = 2;j<primes.length;j++)
        {
            if (primes[j] == 0)
            {
                count++;
                System.out.println(j);
            }
        }
        return count;

    }

    public static void main(String[] args)
    {
        int n = 10;
        System.out.println(new CountPrimes().countPrimes(n));
    }

}
