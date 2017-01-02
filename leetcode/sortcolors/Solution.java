package leetcode.sortcolors;

/**
 * Created by xiaobao on 2017/1/1.
 */
public class Solution {
    void sortColors(int[] nums) {
           int redCount = 0;
           int whiteCount = 0;
           for(int num:nums){
              if(num == 0){
                  redCount++;
              }else if(num == 1){
                  whiteCount++;
              }
           }
           int redAndWhiteCount = redCount + whiteCount;
           for(int i = 0; i < nums.length;i++){
               if(i < redCount){
                   nums[i] =0;
               }else if(i < redAndWhiteCount) {
                   nums[i] = 1;
               }else {
                   nums[i] = 2;
               }
           }
    }
    public static void main(String[] args){
        Solution solution = new Solution();
        int[] testDada = new int[]{0,2,1,1,2,1,0,1,2,1,2,1,0,0,2};
        solution.sortColors(testDada);
        for (int num: testDada){
            System.out.println(num);
        }
    }
}
