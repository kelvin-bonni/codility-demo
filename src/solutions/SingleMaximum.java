package solutions;

public class SingleMaximum {
    static int hasSingleMaximum(int[] a) {
        if (a.length == 0){
            return 0;
        }

        int max = a[0];
        for (int j : a) {
            if (max < j) {
                max = j;
            }
        }

        int count = 0;
        for (int j : a) {
            if (max == j){
                count++;
            }
        }

        if (count == 1) {
            return 1;
        }
        else{
            return 0;
        }
    }

    public static void main(String args[]) { // main method to check if the function is passing all test cases
        // all the test arrays
        int a1[] = { 1, 2, 3, 1, 0 };
        int a2[] = { 18 };
        int a3[] = { 1, 2, 3, 0, 1, 3 };
        int a4[] = { 13, 1, 13, 2, 13, 0, 13, 1, 13 };
        int a5[] = {};
        int a6[] = { -6, -6, -6, -6, -6 };
        // all the outputs of test arrays
        System.out.println(hasSingleMaximum(a1));
        System.out.println(hasSingleMaximum(a2));
        System.out.println(hasSingleMaximum(a3));
        System.out.println(hasSingleMaximum(a4));
        System.out.println(hasSingleMaximum(a5));
        System.out.println(hasSingleMaximum(a6));
    }
}