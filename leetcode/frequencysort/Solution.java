package leetcode.frequencysort;

import java.util.*;

/**
 * Created by xiaobao on 2017/1/2.
 */
public class Solution {
    public String frequencySort(String s) {
        StringBuilder result = new StringBuilder();
        Map<Character,Integer> set = new TreeMap<>();
        for(int i = 0; i < s.length(); i++) {
            Character e = s.charAt(i);
            Integer count = set.get(e);
            if (count == null) {
                count = 1;
            } else {
                count++;
            }
            set.put(e, count);
        }
        List<Map.Entry<Character,Integer>> list = new ArrayList<Map.Entry<Character, Integer>>(set.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });
        for(Map.Entry<Character,Integer> entry : list){
            for(int i = 0; i < entry.getValue();i++){
                result.append(entry.getKey());
            }
        }
        return result.toString();
    }
    public static void main(String[] args){
        Solution solution = new Solution();
        System.out.println(solution.frequencySort("ffggggdechrkeeeeeekkkkkkk"));
    }
}
