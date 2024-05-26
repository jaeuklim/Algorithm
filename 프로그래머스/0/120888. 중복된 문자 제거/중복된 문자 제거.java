import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        List<Character> list = new ArrayList<>();
        
        for(char c : my_string.toCharArray())
            if(!list.contains(c))
                list.add(c);
        
        for(char c : list)
            answer += c;
            
        return answer;
    }
}