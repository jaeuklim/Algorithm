import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String []tmp = s.split("");
        
         if (s.length() == 1) {
            return s;
        }

        
        Arrays.sort(tmp);
        
        if(!tmp[0].equals(tmp[1]))
            answer +=tmp[0];

        for(int i=1; i<tmp.length-1; i++){    
            if(!tmp[i].equals(tmp[i-1]) && !tmp[i].equals(tmp[i+1]))
                answer+=tmp[i];
        }
        
        if(!tmp[tmp.length-2].equals(tmp[tmp.length-1]))
            answer +=tmp[tmp.length-1];
  
        return answer;
    }
}