import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String []str = s.split(" ");
        int []tmp = new int[str.length];
               
        for(int i=0; i<tmp.length; i++)
            tmp[i]=Integer.parseInt(str[i]);
        
        Arrays.sort(tmp);
        
        answer += tmp[0] + " " + tmp[tmp.length-1];
        
        return answer;
    }
}