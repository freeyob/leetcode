package leetcode.removeelement;

/**
 * Created by cong on 17-1-2.
 */
public class Solution {
    public int removeElement(int[] nums, int val) {
        int removedEndPos = nums.length;
        for(int i =0 ;i < removedEndPos; i++){
            if(nums[i] == val){
                for(;removedEndPos > i; removedEndPos--){
                    if(nums[removedEndPos -1] != val){
                        nums[i] = nums[removedEndPos - 1];
                        removedEndPos--;
                        break;
                    }
                }
            }
        }
        return removedEndPos;
    }
    public static void main(String[] args){
        Solution solution = new Solution();
        System.out.println(solution.removeElement(new int[]{},3));
    }
}
