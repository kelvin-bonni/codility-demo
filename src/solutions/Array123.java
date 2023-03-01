package solutions;

public class Array123 {
    int is123Array(int[] a){
        int result = 0, arrayLength = a.length;
        if(arrayLength % 3 != 0 || arrayLength == 0){
            return result;
        }
        else{
            int i=0;
            while(i != arrayLength){
                if(a[i] == 1 && a[i+1] == 2 && a[i+2] == 3)
                    result = 1;
                else{
                    result = 0;
                    break;
                }
                i+=3;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Array123 obj = new Array123();
        System.out.println(obj.is123Array(new int[]{1, 2, 3, 3, 2, 1}));// printing the return value
        System.out.println(obj.is123Array(new int[]{0, 1, 2, 3, 1, 2, 3}));// printing the return value
        System.out.println(obj.is123Array(new int[]{1, 2, 3, 3, 2, 1, 1, 2, 3}));// printing the return value
        System.out.println(obj.is123Array(new int[]{1, 2, 3}));// printing the return value
        System.out.println(obj.is123Array(new int[]{}));// printing the return value
    }
}
