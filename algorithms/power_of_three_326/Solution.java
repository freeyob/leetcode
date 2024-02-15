package power_of_three_326;

public class Solution {
    public boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        }
        if (n == 1) {
            return true;
        }
        var remainder = n % 3;
        var quotient = n / 3;
        while (!(remainder != 0 || quotient == 1)) {
            remainder = quotient % 3;
            quotient = quotient / 3;
        }
        return quotient == 1 && remainder == 0;
    }
}
