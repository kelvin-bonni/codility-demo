package solutions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Stack;

public class Solution1 {

    public static boolean isValid(String s){
//        String s = "()";

        Stack<Character> strArray = new Stack<>();

        for (int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                strArray.push(s.charAt(i));
            }else {
                Character lastElement = strArray.pop();

                if(lastElement == '(' && s.charAt(i) != ')')
                    return false;
                if(lastElement == '{' && s.charAt(i) != '}')
                    return false;
                if(lastElement == '[' && s.charAt(i) != ']')
                    return false;
            }
        }

        return strArray.empty();
    }

    public static void main(String[] args) throws ParseException {
        System.out.println(Solution1.isValid("(){}[]"));



//        Solution1 solution1 = new Solution1();
//        System.out.println(solution1.solution(new int[] {1, 2, 5, 9, 9}, 5));
//        System.out.println(solution1.solution(new int[] {11, 22, 33, 44, 55}, 5));
//        System.out.println(solution1.solution(new int[] {1, 2, 3, 4, 5}, 5));
//        String str1 = "Hello ";
//
//        StringBuilder stringBuilder = new StringBuilder(str1);
//        stringBuilder.append("there");
//        System.out.println(stringBuilder);
//        System.out.println(Math.ceil(22.9));
//        Collection<String> collection = new ArrayList<>();
//        SimpleDateFormat sdf
//                = new SimpleDateFormat(
//                "dd-MM-yyyy HH:mm:ss.SSS");
//        Date d1 = sdf.parse("2022-12-08 01:40:11.418");
//        Date d2 = sdf.parse("2022-12-08 01:40:11.513");
//
//        // Calculate time difference
//        // in milliseconds
//        long difference_In_Time
//                = d2.getTime() - d1.getTime();
//
//        System.out.println(difference_In_Time);

    }

    //Binary search O(logn)
    public int solution(int[] A, int X) {
        int N = A.length;
        if(N == 0){
            return -1;
        }
        int l = 0;
        int r = N - 1;
        while (l < r){
            int m = (l + r) / 2;
            if(A[m] > X){
                r = m - 1;
            }else if(A[m] == X){
                return m;
            }else{
                //break the cycle
                //will end up with an infinite loop
                l = m + 1;
            }
        }
        if (A[l] == X){
            return l;
        }
        return -1;
    }
}
