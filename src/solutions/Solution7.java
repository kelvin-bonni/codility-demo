package solutions;

import java.util.*;

public class Solution7 {

    public static void main(String[] args) {
        Solution7 solution1 = new Solution7();
        System.out.println(solution1.solution(Arrays.asList(1, 2, 3), Arrays.asList(2, 4)));
    }

    public static List<Integer> solution(List<Integer> teamA, List<Integer> teamB){

        List<Integer> res = new ArrayList<>();
        Collections.sort(teamA);

        for (int valB : teamB){
            res.add(runBinarySearchIteratively(teamA, valB)+1);
        }

        return res;
    }

    public static int runBinarySearchIteratively(
            List<Integer> sortedArray, int key) {
        int index = -1;
        int low = 0;
        int high = sortedArray.size()-1;

        while (low <= high) {
            int mid = low  + ((high - low) / 2);
            if (sortedArray.get(mid) < key) {
                low = mid + 1;
                index = mid;
            } else if (sortedArray.get(mid) > key) {
                high = mid - 1;
//                index = high;
            } else if (sortedArray.get(mid) == key) {
                index = mid;
                break;
            }
        }
        return index;
    }
}
