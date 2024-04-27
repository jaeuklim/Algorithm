import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = my_string.toLowerCase();
        
        char []tmp = answer.toCharArray();
        
        Arrays.sort(tmp);
        
        answer = new String(tmp);
        
        return answer;
    }
}