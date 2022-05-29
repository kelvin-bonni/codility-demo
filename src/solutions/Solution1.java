package solutions;

public class Solution1 {

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        System.out.println(solution1.solution(new int[] {1, 2, 5, 9, 9}, 5));
        System.out.println(solution1.solution(new int[] {11, 22, 33, 44, 55}, 5));
        System.out.println(solution1.solution(new int[] {1, 2, 3, 4, 5}, 5));
    }

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
                l = m + 1;
            }
        }
        if (A[l] == X){
            return l;
        }
        return -1;
    }
}
