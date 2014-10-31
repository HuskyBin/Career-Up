/*
Write an algorithm which computes the number of trailing zeros in n factorial
*/
class Solution {
    /*
     * param n: As desciption
     * return: An integer, denote the number of trailing zeros in n!
     */
    public long trailingZeros(long n) {
        // write your code here
        if (n <= 0) {
            return 0;
        }
        long result = 0;
        for (long i = 5; n / i > 0; i = i * 5) {
            result += n / i;
        }
        return result;
    }
};
