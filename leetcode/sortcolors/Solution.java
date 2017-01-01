package leetcode.sortcolors;

import java.util.ArrayList;

/**
 * Created by xiaobao on 2017/1/1.
 */
public class Solution {
    public void sortColors(int[] nums) {
        int len = nums.length;
        ArrayList<Integer> red = new ArrayList();
        ArrayList<Integer> white = new ArrayList();
        ArrayList<Integer> blue = new ArrayList();
        for(int num :nums){
            if(num == 0){
                red.add(num);
            }else if(num == 1){
                white.add(num);
            }else if(num == 2){
                blue.add(num);
            }
        }
        red.addAll(white);
        red.addAll(blue);
        for(int i = 0; i <len;i++){
           nums[i] = red.get(i);
           System.out.println(nums[i]);
        }
    }
}
