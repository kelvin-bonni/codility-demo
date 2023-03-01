package solutions;

import java.util.*;
import java.util.regex.Pattern;

public class Solution8 {

    public static void main(String[] args) {
        Solution8 solution1 = new Solution8();
        System.out.println(calPoints(new String[]{"5", "2", "C", "D", "+"}));
    }

    public static int calPoints(String[] opts){
        int result = Integer.MIN_VALUE;
        ArrayList<Integer> resultArray = new ArrayList<>();
        Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");

        for (int i = 0; i < opts.length; i++){
            if (pattern.matcher(opts[i]).matches()){
                resultArray.add(Integer.parseInt(opts[i]));
            } else if (Objects.equals(opts[i], "+")) {
                resultArray.add(Integer.parseInt(opts[i-1] + Integer.parseInt(opts[i] + 2)));
            } else if (Objects.equals(opts[i], "D")) {
                resultArray.add(Integer.parseInt(opts[i-1]) * 2);
            }
        }
        return result;
    }
}
