package leetcode;

public class ZigZagConversion {
	 public String convert(String s, int numRows) {
		    if(numRows == 1){
		    	return s;
		    }
		 	StringBuffer[] rows = new StringBuffer[numRows] ;
		 	for(int i = 0; i < numRows ; i++){
		 		rows[i]  = new StringBuffer();
		 	}
		 	int count = s.length();
		 	for(int i = 0; i < count; i++){
		 		if((i / (numRows -1) )% 2 == 0){
		 			rows[i % (numRows - 1)].append(s.charAt(i));
		 		}else{
		 			rows[numRows -1  - i % (numRows - 1)].append(s.charAt(i));
		 		}
		 	}
		 	StringBuffer result = new StringBuffer();
		 	for(StringBuffer buffer : rows){
		 		result.append(buffer);
		 	}
	        return result.toString();
	   }
}
