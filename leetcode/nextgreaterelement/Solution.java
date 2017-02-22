package leetcode.nextgreaterelement;

/**
 * Created by cong on 17-2-22.
 */
public class Solution {
    public int[] nextGreaterElement(int[] findNums, int[] nums) {
        //遍历findNums的元素
        //对比其在nums的位置
        //如果找到，遍历后边的元素，有比它大的返回其值，没有就返回-1
        //如果没找到返回-1
        for(int i = 0; i < findNums.length; i++){
            boolean find = false;
            for(int j = 0; j < nums.length; j++){
                if(findNums[i] == nums[j]){
                   find = true;
                }else {
                    if(find && findNums[i] < nums[j]) {
                        findNums[i] = nums[j];
                        break;
                    }
                }
                if(j == nums.length - 1){
                    findNums[i] = -1;
                }
            }
        }
        return findNums;
    }
    public static final void main(String[] args){
        Solution solution = new Solution();
        int[] result = solution.nextGreaterElement(new int[]{},new int[]{});
        for(int num:result){
            System.out.println(num);
        }
    }
}
