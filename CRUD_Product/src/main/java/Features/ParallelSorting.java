package Features;

import java.util.Arrays;
import java.util.Random;

public class ParallelSorting {

    public static void main(String []args)
    {
        Random rm=new Random();
        int[] LargeArray=rm.ints(1_000_000).toArray();

        long starttime=System.currentTimeMillis();
        Arrays.sort(LargeArray);
        long endtime=System.currentTimeMillis();
        System.out.println("Time Taken--->"+(endtime-starttime));

        long starttime1=System.currentTimeMillis();
        Arrays.parallelSort(LargeArray);
        long endtime1=System.currentTimeMillis();
        System.out.println("Time Taken Parallel Sorting --->"+(endtime1-starttime1));
    }
}
