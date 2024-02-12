package climb_stairs_0070;

public class Solution {
    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int waysNum = 0;
        int prePreNum = 1;
        int preNum = 2;
        for (int i = 3; i <= n; i++) {
            waysNum = preNum + prePreNum;
            prePreNum = preNum;
            preNum = waysNum;
        }
        return waysNum;
    }
}
