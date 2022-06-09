package solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Solution3 {

    public static void main(String[] args) {
        Solution3 solution3 = new Solution3();
        solution3.solution(new String[] {"039", "4", "14", "32","34", "7"});
        solution3.solution(new String[] {"801234567", "180234567", "0", "189234567", "891234567", "98", "9"});
        solution3.solution(new String[] {"5421", "245", "1452", "0345", "53", "354"});
    }

    public int solution(String[] E) {
        // write your code in Java SE 8
        int maxDays = 10, day1=0, day2=0, day1Count=0, day2Count=0, ans = 0;
        int [] dayCount = new int[maxDays];

//        for(int i=0; i<maxDays; i++){
//            for(String employeeDates : E){
//                if(employeeDates.contains(Integer.toString(i))){
//                    dayCount[i]++;
//                    //dayCount[0] = 1
//
//                    if(dayCount[i] > day1Count){
//                        if(day1Count > day2Count){
////                      if(i > day2){
//                            day2 = day1;
//                            day2Count = day1Count;
//                        }
//                        day1Count = dayCount[i];
//                        day1 = i;
//                    }else if(dayCount[i] > day2Count){
//                        day2Count = dayCount[i];
//                        day2 = i;
//                    }
//                }
//            }
//        }

//        for(String employeeDates : E){
//            if(employeeDates.contains(Integer.toString(day1))
//                    || employeeDates.contains(Integer.toString(day2)))
//                ans++;
//        }

//        System.out.println(day1);


        Map<String, Integer> map = new HashMap<>();
        for (int i=0; i<maxDays; i++){
            for (int j=i+1; j<maxDays; j++){
                int value = 0;
                for(String employeeDates : E){
                    if(employeeDates.contains(Integer.toString(i))
                            || employeeDates.contains(Integer.toString(j)))
                        map.put(i+""+j, ++value);//{5, 82}{7, 90}
                }
            }
        }

//        ArrayList<Integer> arrayList = new ArrayList<>(map.values());


//        return Collections.max(arrayList);
        Integer finalAns = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getValue();
        System.out.println("the map: "+map);
        System.out.println("the final answer: "+finalAns);

        return finalAns;
    }

//    int[] freq = new int[10];
//
//    for(String s : E){
//
//        for(int i=0; i<s.length(); i++){
//
//            int day = s.charAt(i)-'0';
//            freq[day]++;
//        }
//    }
//
//    int max_employee = 0;
//
//    for(int i=0; i<freq.length; i++){
//        if(freq[i]>max_employee){
//            max_employee = freq[i];
//        }
//    }
//
//   return max_employee;
}
