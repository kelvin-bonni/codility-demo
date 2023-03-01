package solutions;

public class OlympicArray2 {

    public static void main(String[] args) {
        System.out.println(isOlympic(new int[]{2, 2, 1, 1}));
        System.out.println(isOlympic(new int[]{1, 1000, 100, 10000, 21}));
        System.out.println(isOlympic(new int[]{1, 2, 1, 3, 2}));
        System.out.println(isOlympic(new int[]{1,2, -1, 2, 2}));
    }

    // The function isOlympic returns 1 if its array argument is an Olympic array,
    // otherwise it returns 0.
    public static int isOlympic(int[] a) {
        int n = a.length;
        int sum=0,flag=0;
        // First step we will sort the elements of the array
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (a[j] > a[j+1])
                {
                    // swap temp and a[i]
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
        // Second step is to find the sum of next elements of the current element
        // And check if the sum is less than or equal to the current element or not
        for (int i = n-1; i >= 1; i--) {
            sum=0;
            for (int j = i-1; j>=0; j--) {
                if(a[j]!=a[i])
                    sum = sum+a[j];
            }
            if (a[0]>=0 && sum<=a[i]) {
                flag=1;
            }
            else {
                return 0;
            }
        }

        return 1;
    }
}
