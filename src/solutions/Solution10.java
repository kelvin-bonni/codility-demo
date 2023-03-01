package solutions;

import java.util.*;

public class Solution10 {

    public static void main(String[] args) {
        Solution10 solution1 = new Solution10();
        System.out.println(Solution10.solutions("red2 blue5 black4 green1 gold3"));
        System.out.println(Solution10.solutions("gold2 black1 white3"));
    }

    public static String solutions(String input){
        String result = "";

        String[] strArr = input.split(" ");
        Arrays.sort(strArr, (s1, s2) -> {
            char s1LastElement = s1.charAt(s1.length()-1);
            char s2LastElement = s2.charAt(s2.length()-1);
            return s1LastElement - s2LastElement;
        });

        for (String str : strArr){
            String color = str.substring(0, str.length()-1);
            result = result.concat(color+" ");
        }

        return result.trim();

    }
}
