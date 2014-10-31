/*
Add two number without temporary variables
*/
public class SeventeenOne {
    public void addTwoNumberOne(int a, int b) {
        a = a - b;
        b = b + a;
        a = b - a;
    }

    public void addTwoNumberTwo(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
    }
}
