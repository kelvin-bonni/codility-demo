package solutions;

import java.util.Arrays;

public class HasNValues2 {

    public static void main(String[] args)
    {
        int a[]={1, 2, 2, 1};
        int b[]={1, 1, 1, 8, 1, 1, 1, 3, 3};
        int c[]={1, 2, 2, 1};
        int d[]={1, 2, 3, 4,5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(a)+" has 2 distinc values: "+hasNValues(a,2));
        System.out.println(Arrays.toString(b)+" has 3 distinc values: "+hasNValues(b,3));
        System.out.println(Arrays.toString(c)+" has 2 distinc values: "+hasNValues(c,3));
        System.out.println(Arrays.toString(d)+" has 2 distinc values: "+hasNValues(c,20));
    }
    public static int hasNValues(int[] a, int n)
    {
        int hasNValues = 1;
        int[] uniqueValues = new int[n];
        int uniqueindex = 0;
        for (int i = 0; i < a.length && hasNValues == 1; i++)
        {
            if (isExistInArray(uniqueValues, a[i]) == -1)
            {
                if (uniqueindex < n)
                {
                    uniqueValues[uniqueindex] = a[i];
                    uniqueindex++;
                }
                else
                {
                    hasNValues = 0;
                }
            }
        }

        if (uniqueindex != n) hasNValues = 0;

        return hasNValues;
    }
    //helper function to find if number io in array or not
    public static int isExistInArray(int a[],int num)
    {
        for(int i=0;i<a.length;i++)
            if(a[i]==num)
                return 1;
        return -1;
    }
}
