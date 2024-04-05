package four_sum_ii_0454;

import java.util.HashMap;

public class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int count = 0;
        var sum34CountMap = new HashMap<Integer, Integer>();
        for (int num3 : nums3) {
            for (int num4 : nums4) {
                int sumkey = num3 + num4;
                Integer sumCount = sum34CountMap.get(sumkey);
                if (sumCount == null) {
                    sumCount = 0;
                }
                sumCount++;
                sum34CountMap.put(sumkey, sumCount);
            }
        }
        for (int num1 : nums1) {
            for (int num2 : nums2) {
                Integer sumkey = -(num1 + num2);
                Integer sumCount = sum34CountMap.get(sumkey);
                if (sumCount != null) {
                    count += sumCount;
                }
            }
        }
        return count;
    }
}
