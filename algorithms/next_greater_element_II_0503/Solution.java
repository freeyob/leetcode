package next_greater_element_II_0503;

public class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            Integer greater = null;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] > nums[i]) {
                    greater = nums[j];
                    break;
                }
            }
            if (greater == null) {
                for (int k = 0; k < i; k++) {
                    if (nums[k] > nums[i]) {
                        greater = nums[k];
                        break;
                    }
                }

            }
            result[i] = greater == null ? -1 : greater;
        }
        return result;
    }
}
