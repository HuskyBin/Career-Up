/*
Add Two numnber without use arithmetic  operators
*/
public class EighteenOne {
    public int addTwoNumber(int a, int b) {
        if (b == 0) {
            return a;
        }
        int sum = a ^ b;
        int carry = (a & b) << 1;
        return addTwoNumber(sum, carry);
    }

    public static void main(String[] args) {
        EighteenOne obj = new EighteenOne();
        int result = obj.addTwoNumber(1, 2);
        System.out.println(result);

        result = obj.addTwoNumber(-1, 2);
        System.out.println(result);
    }
}
