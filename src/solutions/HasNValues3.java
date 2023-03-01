package solutions;

/**
 * * Write a function named hasNValues which takes an array and an integer n as arguments. It returns true if all
 * * the elements of the array are one of n different values.
 * *
 * * If you are writing in Java or C#, the function signature is
 * * int hasNValues(int[ ] a, int n)
 * *
 * * Note that an array argument is passed by reference so that any change you make to the array in your function
 * * will be visible when the function returns. Therefore, you must not modify the array in your function! In other
 * * words, your function should have no side effects.
 * *
 * * if a is                              if n is         return
 * *
 * * {1, 2, 2, 1}                         2               1 (because there are 2 different element values, 1 and 2)
 * * {1, 1, 1, 8, 1, 1, 1, 3, 3}          3               1 (because there are 3 different element values, 1, 3, 8)
 * * {1, 2, 3, 4, 5, 6, 7, 8 ,9, 10}      10              1 (because there are 10 different element values)
 * * {1, 2, 2, 1}                         3               0 (because there are 2 different element values, not 3 as required)
 * * {1, 1, 1, 8, 1, 1, 1, 3, 3}          2               0 (because there are 3 different element values, not 2 as required)
 * * {1, 2, 3, 4, 5, 6, 7, 8 ,9, 10}      20              0 (because there are 10 different element values, not 20 as required)
 * *
 * *
 */

public class HasNValues3 {
    public static void main(String[] args) {
//        int[] arrayOfNumbers = {1, 2, 2, 1};
//        int num = 2;

//        int[] arrayOfNumbers = {1, 1, 1, 8, 1, 1, 1, 3, 3};
//        int num = 3;

//        int[] arrayOfNumbers = {1, 2, 3, 4, 5, 6, 7, 8 ,9, 10};
//        int num = 10;

//        int[] arrayOfNumbers ={1, 2, 2, 1};
//        int num = 3;

//        int[] arrayOfNumbers ={1, 1, 1, 8, 1, 1, 1, 3, 3};
//        int num = 2;

        int[] arrayOfNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int num = 20;

        System.out.println("Checking if array="+arrayOfNumbers+" has NValues with n={}. Return 1 for Yes and 0 for No."+ num);

        System.out.println("Actual result: "+ hasNValues(arrayOfNumbers, num));
    }

    public static int hasNValues(int[] a, int n){
        int[] temp = new int[n];
        int k = 0;
        boolean flag = false;
        for(int i = 0;i<n;i++){
            flag = false;
            for(int j = 0;j<k;j++){
                if(a[i] == temp[j]){
                    flag = true;
                }
            }
            if(!flag){
                temp[k++] = a[i];
            }
        }
        if(k == n){
            return 1;
        }
        else {
            return 0;
        }
    }

}
