/*
Compare two number without if else
*/
public class SeventeenFour {
    public int getMaxOne(int a, int b) {
        int k = sign(a - b);
        int q = flip(k);

        return a * k + b * q;
    }

    private int flip(int a) {
        return 1 ^ a;
    }

    private int sign(int a) {
        return flip((a >> 31) & 1);
    }

    public int getMaxBest(int a, int b) {
        int sa = sign(a);
        int sb = sign(b);
        int sab = sign(a - b);

        int use_a = sa ^ sb;
        int use_a_b = flip(sa ^ sb);

        int k = use_a * sa + sab * use_a_b;
        int q = flip(k);

        return a * k + b * q;
    }

    public static void main(String[] args) {
        SeventeenFour obj = new SeventeenFour();
        int result = obj.getMaxBest(2, 19);
        System.out.println(result);
    }
}
