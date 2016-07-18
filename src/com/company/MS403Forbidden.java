package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by qusijun on 16/4/6.
 */
public class MS403Forbidden {
    public static void main(String[] args)
    {
        Scanner scanner1 = new Scanner(System.in);
        int N = scanner1.nextInt();
        int M = scanner1.nextInt();
        //System.out.println(N);
        List<String> allowsbWithMask = new ArrayList<String>();
        List<String> allowsbWithoutMask = new ArrayList<String>();
        List<String> denysbWithMask = new ArrayList<String>();
        List<String> denysbWithOoutMask = new ArrayList<String>();
        List[] sbs = new ArrayList[4];
        sbs[0] = allowsbWithMask;
        sbs[1] = allowsbWithoutMask;
        sbs[2] = denysbWithMask;
        sbs[3] = denysbWithOoutMask;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0;i<N;i++)
        {
            String str = scanner.nextLine();
            String[] input = str.split(" ");
            if (input[0].equals("allow"))
            {
                String[] ip = input[1].split("/");
                if (ip.length == 1)
                    allowsbWithoutMask.add(input[1]);
                else
                    allowsbWithMask.add(input[1]);
            }
            else
            {
                String[] ip = input[1].split("/");
                if (ip.length == 1)
                    denysbWithOoutMask.add(input[1]);
                else
                    denysbWithMask.add(input[1]);
            }
        }
        for (int i = 0;i<allowsbWithoutMask.size();i++)
            System.out.println(allowsbWithMask.get(i));

        for (int i = 0;i<M;i++)
        {
            String ip = scanner.nextLine().trim();
            for (int j = 0;j<4;j++)
            {
                boolean flag = true;
                ArrayList temp = (ArrayList)sbs[i];
                if (j == 0)
                {
                    for (int k = 0;k<temp.size();k++)
                    {
                        if (isInRange(ip,(String)temp.get(k))) {
                            System.out.println("YES");
                            flag = false;
                            break;

                        }
                    }
                    if (!flag)
                        break;
                }
                if (j == 1)
                {
                    for (int k = 0;k<temp.size();k++)
                    {
                        if (ip.equals((String)temp.get(k)))
                        {
                            System.out.println("YES");
                            flag = false;
                            break;
                        }

                    }
                    if (!flag)
                        break;
                }

                if (j ==  2)
                {
                    for (int k = 0;k<temp.size();k++)
                    {
                        if (isInRange(ip,(String)temp.get(k))) {
                            System.out.println("NO");
                            flag = false;
                            break;

                        }
                    }
                    if (!flag)
                        break;
                }
                if (j == 3)
                {
                    for (int k = 0;k<temp.size();k++)
                    {
                        if (ip.equals((String)temp.get(k)))
                        {
                            System.out.println("NO");
                            flag = false;
                            break;
                        }

                    }
                    if (!flag)
                        break;
                }

            }

        }

    }
    public static boolean isInRange(String ip, String cidr) {
        //System.out.println(cidr);
        String[] ips = ip.split("\\.");
        int ipAddr = (Integer.parseInt(ips[0]) << 24)
                | (Integer.parseInt(ips[1]) << 16)
                | (Integer.parseInt(ips[2]) << 8) | Integer.parseInt(ips[3]);
        int type = Integer.parseInt(cidr.replaceAll(".*/", ""));
        int mask = 0xFFFFFFFF << (32 - type);
        String cidrIp = cidr.replaceAll("/.*", "");
        String[] cidrIps = cidrIp.split("\\.");
        int cidrIpAddr = (Integer.parseInt(cidrIps[0]) << 24)
                | (Integer.parseInt(cidrIps[1]) << 16)
                | (Integer.parseInt(cidrIps[2]) << 8)
                | Integer.parseInt(cidrIps[3]);

        return (ipAddr & mask) == (cidrIpAddr & mask);
    }
}
