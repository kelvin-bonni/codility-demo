package solutions;

public class Solution4 {

    public static void main(String[] args) {
        Solution4 solution4 = new Solution4();
        solution4.productExceptSelf(new int[] {1, 2, 3, 4});
        solution4.productExceptSelf(new int[] {-1,1,0,-3,3});
//        System.out.println(solution4.productExceptSelf(new int[] {1, 2, 3, 4, 5}));
    }

    //Binary search O(logn)
    public int[] productExceptSelf(int[] nums) {

        int[] answer = new int[nums.length];

        for (int j=0; j<nums.length; j++) {
            int value = 1;
            for (int i = 0; i < nums.length; i++) {
                if (i != j)
                    value *= nums[i];
            }
            answer[j] = value;
            System.out.println(answer[j]);
        }

        return answer;
    }
}
