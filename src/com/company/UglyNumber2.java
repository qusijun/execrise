import java.util.LinkedList;
import java.util.List;

/**
 * Created by qusijun on 16/4/15.
 */
public class UglyNumber2 {

    public int nthUglyNumber(int n)
    {
        List<Integer> result = new LinkedList<Integer>();
        result.add(1);
        int idx1,idx2,idx3;
        idx1 = idx2 = idx3 = 0;
        for (int i = 1;i<n;i++)
        {
            int temp = min(result.get(idx1)*2,result.get(idx2)*3,result.get(idx3)*5);
            if (temp == result.get(idx1)*2) idx1++;
            if (temp == result.get(idx2)*3) idx2++;
            if (temp == result.get(idx3)*5) idx3++;
        }
        return result.get(n-1);

    }
    int min(int a,int b,int c)
    {
        return Math.min(a,Math.min(b,c));
    }
}
