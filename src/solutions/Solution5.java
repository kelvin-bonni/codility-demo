package solutions;

//palindrome of integers
public class Solution5 {

    public static void main(String[] args) {
        Solution5 solution5 = new Solution5();
        System.out.println(solution5.solution(12321));
        System.out.println(solution5.solution(42325));
    }

    //Binary search O(logn)
    public boolean solution(int A) {
        int[] intArr = Integer.toString(A).chars().map(c -> c-'0').toArray();;
        int len = intArr.length;
        for (int i = 0; i < len / 2; i++) {
            if (intArr[i] != intArr[len - i - 1]) {
                return false;
            }
        }
        return true;

    }
}
