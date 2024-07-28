import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String []tmp = s.split("");
     
        Arrays.sort(tmp);
        
        for(int i=tmp.length-1; i>=0; i--)
            answer+=tmp[i];
        
        return answer;
    }
}