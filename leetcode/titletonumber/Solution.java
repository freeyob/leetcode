package leetcode.titletonumber;

/**
 * Created by xiaobao on 2017/2/24.
 */
public class Solution {
    public int titleToNumber(String s) {
        int num = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            num = num + getWeight(s.length() - i) * (c - 64);
        }
        return num;
    }
    private int getWeight(int level){
        int result = 1;
        for(int i = 0; i < level - 1; i++){
            result *= 26;
        }
        return result;
    }
    public static void main(String[] args){
        Solution solution = new Solution();
        int result = solution.titleToNumber("ZZ");
        System.out.print(result);
    }
}
