package solutions;

public class SelfReferential {
    public static void main(String[] args) {
        SelfReferential obj = new SelfReferential();
        System.out.println(obj.isSelfReferential(new int[]{2, 0, 0}));// printing the return value
        System.out.println(obj.isSelfReferential(new int[]{0}));// printing the return value
        System.out.println(obj.isSelfReferential(new int[]{1}));// printing the return value
        System.out.println(obj.isSelfReferential(new int[]{1, 2, 1, 0}));// printing the return value
        System.out.println(obj.isSelfReferential(new int[]{2, 0, 2, 0}));// printing the return value
        System.out.println(obj.isSelfReferential(new int[]{2, 1, 2, 0, 0}));// printing the return value
        System.out.println(obj.isSelfReferential(new int[]{3, 2, 1, 1, 0, 0, 0}));// printing the return value
        System.out.println(obj.isSelfReferential(new int[]{4, 2, 1, 0, 1, 0, 0, 0}));// printing the return value
        System.out.println(obj.isSelfReferential(new int[]{5, 2, 1, 0, 0, 1, 0, 0, 0}));// printing the return value
        System.out.println(obj.isSelfReferential(new int[]{6, 2, 1, 0, 0, 0, 1, 0, 0, 0}));// printing the return value
    }

    int isSelfReferential(int[] a) {
        if (a == null || a.length == 0)
            return 0;
        for (int i = 0; i < a.length; i++) {
            int c = 0;
            for (int val: a) {
                if (val == i)
                    c++;
            }
            if (c != a[i])
                return 0;
        }
        return 1;
    }
}
