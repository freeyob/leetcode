package leetcode.validanagram;


import java.util.HashMap;

/**
 * Created by cong on 17-1-2.
 */
public class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character,Integer> set = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            Character e = s.charAt(i);
            Integer count = set.get(e);
            if(count == null){
                set.put(e, new Integer(1));
            }else{
                count++;
                set.put(e,count);
            }
        }
        for(int j = 0; j < t.length(); j++){
            Character e = t.charAt(j);
            Integer count = set.get(e);
            if(count == null){
                return false;
            }else {
                count--;
                if(count < 0){
                   return false;
                }
            }
            set.put(e,count);
        }
        return true;
    }
    public static void main(String[] args){
        Solution solution = new Solution();
        System.out.println(solution.isAnagram("abc","acv"));
    }
}
