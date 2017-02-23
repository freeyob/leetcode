package leetcode.findmin;

/**
 * Created by xiaobao on 2017/2/23.
 */
public class Solution {
    public int findMin(int[] nums) {
        for(int i = 0; i < nums.length - 1 ; i++){
            if(nums[i] - nums[i + 1] > 0){
                return nums[i + 1];
            }
        }
        return  nums[0];
    }
}
