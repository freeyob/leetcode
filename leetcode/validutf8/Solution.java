package leetcode.validutf8;

/**
 * Created by xiaobao on 2017/2/27.
 */
public class Solution {
    public boolean validUtf8(int[] data) {
        //把整形数数组转换为比特字符串数组
        //如果匹配到第一种模式，到下一个
        //如果匹配到第二种模式，检测规则，到下一个
        //如果匹配到第
        StringBuilder[] dataBitsStr = new StringBuilder[data.length];
        for(int i = 0; i < data.length; i++){
            dataBitsStr[i] = new StringBuilder();
            for(int j = 0; j < 8; j++){
                dataBitsStr[i] =dataBitsStr[i].insert(0,data[i] % 2 );
                data[i] = data[i] / 2;
            }
        }
        for(int i = 0; i < dataBitsStr.length; i++){
            if(dataBitsStr[i].indexOf("0") == 0){
                continue;
            }else if(dataBitsStr[i].indexOf("110") == 0){
                i++;
                if(i >= dataBitsStr.length){
                    return false;
                }
                if(dataBitsStr[i].indexOf("10") == 0){
                    continue;
                }else {
                    return false;
                }
            }else if(dataBitsStr[i].indexOf("1110") == 0){
                i++;
                if(i >=  dataBitsStr.length){
                    return false;
                }
                if(dataBitsStr[i].indexOf("10") == 0){

                }else {
                    return false;
                }
                i++;
                if(i >=  dataBitsStr.length){
                    return false;
                }
                if(dataBitsStr[i].indexOf("10") == 0){
                    continue;
                }else {
                    return false;
                }
            }else if(dataBitsStr[i].indexOf("11110") == 0){
                i++;
                if(i >=  dataBitsStr.length){
                    return false;
                }
                if(dataBitsStr[i].indexOf("10") == 0){

                }else {
                    return false;
                }
                i++;
                if(i >=  dataBitsStr.length){
                    return false;
                }
                if(dataBitsStr[i].indexOf("10") == 0){

                }else {
                    return false;
                }
                i++;
                if(i >=  dataBitsStr.length){
                    return false;
                }
                if(dataBitsStr[i].indexOf("10") == 0){
                    continue;
                }else {
                    return false;
                }
            }else {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Solution solution = new Solution();
        System.out.println(solution.validUtf8(new int[]{197,130,1}));
        System.out.println(solution.validUtf8(new int[]{240,162,138,147}));
    }
}
