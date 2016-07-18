package com.company;

import java.util.*;
import java.util.Map.Entry;

/**
 * Created by qusijun on 16/5/4.
 */
public class TopKFrequentElement {
    public List<Integer> topKFrequent(int[] nums,int k)
    {
        HashMap map = new HashMap();
        List<Integer> result = new ArrayList<Integer>();
        PriorityQueue heap = new PriorityQueue(k,new Comparator<Entry<Integer,Integer>>()
        {
            public int compare(Entry e1,Entry e2)
            {
                int v1 = (int)e1.getValue();
                int v2 = (int)e2.getValue();
                return v1 < v2 ? -1:(v1 == v2?0:1);
            }

        });
        for (int i = 0;i<nums.length;i++)
        {
            int temp  = (int)map.getOrDefault(nums[i],0);
            map.put(nums[i],temp+1);
        }
        ///遍历hashmap
        Iterator iter = map.entrySet().iterator();
        while (iter.hasNext())
        {
            Entry e = (Entry)iter.next();
            if (heap.size() < k)
                heap.add(e);
            else
            {
                Entry top = (Entry)heap.peek();
                if ((int)e.getValue() > (int)top.getValue())
                {
                    heap.poll();
                    heap.add(e);
                }
            }

        }
        while (!heap.isEmpty())
        {
            Entry e = (Entry)heap.poll();
            result.add((int)e.getKey());
        }
        return result;
    }

}
