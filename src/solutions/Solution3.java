package solutions;

public class Solution3 {

    public static void main(String[] args) {
        Solution3 solution3 = new Solution3();
        solution3.solution(new String[] {"801234567", "180234567", "0", "189234567", "891234567", "98", "9"});
    }

    public int solution(String[] E) {
        // write your code in Java SE 8
        int maxDays = 10, day1=0, day2=0, day1Count=0, day2Count=0, ans = 0;
        int [] dayCount = new int[maxDays];

        for(int i=0; i<maxDays-1; i++){
            for(String employeeDates : E){
                if(employeeDates.contains(Integer.toString(i))){
                    dayCount[i]++;

                    if(dayCount[i] > day1Count){
                        day1Count = dayCount[i];
                        if(i > day2)
                            day2 = day1;
                        day1 = i;
                    }else if(dayCount[i] > day2Count){
                        day2Count = dayCount[i];
                        day2 = i;
                    }
                }
            }
        }

        for(String employeeDates : E){
            if(employeeDates.contains(Integer.toString(day1))
                    || employeeDates.contains(Integer.toString(day2)))
                ans++;
        }

        System.out.println(day1);
        System.out.println(day2);

        return ans;
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
