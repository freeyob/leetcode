package plus_one_0066;

public class Solution {
    public int[] plusOne(int[] digits) {
        int bit = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i] = digits[i] + bit;
            bit = digits[i] / 10;
            digits[i] = digits[i] % 10;
        }
        if (bit > 0) {
            int[] result = new int[digits.length + 1];
            for (int i = 0; i < result.length; i++) {
                if (i == 0) {
                    result[i] = bit;
                } else {
                    result[i] = digits[i - 1];
                }
            }
            return result;
        } else {
            return digits;
        }
    }
}
