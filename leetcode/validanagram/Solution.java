package leetcode.validanagram;

import java.util.LinkedList;

/**
 * Created by cong on 17-1-2.
 */
public class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        LinkedList set = new LinkedList();
        for(int i = 0;i < s.length();i++){
            set.add(new Character(s.charAt(i)));
        }
        for(int i = 0;i < t.length();i++){
            Character e = t.charAt(i);
            if(set.contains(e)){
                set.remove(e);
            }
        }
        return set.size() == 0 ? true:false;
    }
    public static void main(String[] args){
        Solution solution = new Solution();
        System.out.println(solution.isAnagram("",""));
    }
}
