package solutions;

import java.util.Arrays;

public class Solution2 {

    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        System.out.println(solution2.solution(new int[] {1, 3, 2, 1, 2, 1, 5, 3, 3, 4, 2}));
        System.out.println(solution2.solution(new int[] {5, 8}));
        System.out.println(solution2.solution(new int[] {1, 1, 1, 1}));
        System.out.println(solution2.solution(new int[] {1, 3, 6, 1, 9, 1, 5, 3, 5, 4, 2}));
    }


    public int solution(int[] A) {
        int numOfStripes = 0;
        int maxElementInA = Arrays.stream(A).max().getAsInt();

        for(int i = 0; i < maxElementInA; i++){
            boolean breakStripe = true;
            for(int j = 0; j < A.length; j++){
                if(numOfStripes > 1000000)
                    return -1;
                if(A[j] > i && breakStripe){
//              if(A[j] >= i && breakStripe){
                    numOfStripes++;
                    breakStripe = false;
                }else if (A[j] <= i){
//              }else if (A[j] < i){
                    breakStripe = true;
                }
            }
        }

        return numOfStripes;

    }
}
