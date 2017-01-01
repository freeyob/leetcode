package leetcode.lengthoflastword;

public class LengthOfLastWord {
	public int lengthOfLastWord(String s) {
		char empty = ' ';
		int result = 0;
		s = s.trim();
		int len = s.length();
		if(len > 0){
			int i = 0;
			for(; i <  len; i++){
				if(s.charAt(len - i -1)  ==  empty){
						result = i;
						break;
				}
			}
			if(i == len){
				result = len;
			}
		}
        return result;
    }
}
