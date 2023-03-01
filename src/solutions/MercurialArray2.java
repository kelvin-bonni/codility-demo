package solutions;

/**
 * Created by sachinkeshav on 1/4/15.
 */
public class MercurialArray2 {

    public static void main(String[] args) {
        System.out.println(isMercurial(new int[]{1, 2, 10, 3, 15, 1, 2, 2}));
        System.out.println(isMercurial(new int[]{5, 2, 10, 3, 15, 1, 2, 2}));
        System.out.println(isMercurial(new int[]{1, 2, 10, 3, 15, 16, 2, 2}));
        System.out.println(isMercurial(new int[]{3, 2, 18, 1, 0, 3, -11, 1, 3}));
        System.out.println(isMercurial(new int[]{2, 3, 1, 1, 18}));
        System.out.println(isMercurial(new int[]{8, 2, 1, 1, 18, 3, 5}));
        System.out.println(isMercurial(new int[]{3, 3, 3, 3, 3, 3}));
        System.out.println(isMercurial(new int[]{1}));
        System.out.println(isMercurial(new int[]{}));
    }

    /// <summary>
    /// Define an array to be a Mercurial array
    /// if a 3 does not occur between any two 1s.
    /// Write a function named isMercurial that
    /// returns 1 if its array argument is a
    /// Mercurial array, otherwise it returns 0
    /// </summary>
    /// <param name="a"></param>
    /// <returns></returns>
    public static int isMercurial(int[] a)
    {
        int isMercurial = 1;

        int firstone = -1, secondone = -1, firstthree = -1;

        for (int i = 0; i < a.length && isMercurial == 1; i++)
        {
            int current = a[i];
            if (current == 1)
            {
                if (firstthree == -1)
                {
                    firstone = i;
                }
                else
                {
                    if (firstthree != -1)
                    {
                        secondone = i;
                        if (firstthree != -1 && firstone != -1 && secondone != -1)
                        {
                            if (firstone < firstthree && firstthree < secondone)
                            {
                                isMercurial = 0;
                            }
                        }
                    }
                }
            }
            else if (current == 3)
                if (firstone != -1)
                    firstthree = i;
        }

        if (firstthree != -1 && firstone != -1 && secondone != -1)
        {
            if (firstone < firstthree && firstthree < secondone)
            {
                isMercurial = 0;
            }
        }

        return isMercurial;
    }
}
