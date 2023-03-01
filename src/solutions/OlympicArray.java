package solutions;

public class OlympicArray {

    public static void main(String[] args) {
        System.out.println(isOlympic(new int[]{2, 2, 1, 1}));
        System.out.println(isOlympic(new int[]{1, 1000, 100, 10000, 21}));
        System.out.println(isOlympic(new int[]{1, 2, 1, 3, 2}));
        System.out.println(isOlympic(new int[]{1,2, -1, 2, 2}));
    }

    ///<summary>
    ///An Olympic array is defined to be an array in which every value
    ///is greater than or equal to the sum of the values less than it.
    ///The sum of the values less than the minimum value in the array is defined to be 0.
    ///</summary>
    /// <param name="a"></param>
    /// <returns></returns>
    public static int isOlympic(int[] a)
    {
        int _arrayLength = a.length;

        for (int d1 = 0; d1 < _arrayLength; d1++)
        {
            int _sum = 0;

            for (int d2 = 0; d2 < _arrayLength; d2++)
            {
                if (a[d2] < a[d1])
                    _sum += a[d2];
            }

            if (a[d1] < _sum)
                return 0;
        }

        return 1;
    }
}
