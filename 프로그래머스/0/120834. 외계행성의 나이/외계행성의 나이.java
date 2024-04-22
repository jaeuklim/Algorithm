import java.util.*;

class Solution {
    public String solution(int age) {
        String answer = "";
        List<Character> list = new ArrayList<>();
        String tmp = Integer.toString(age);

        
        for(int i=0; i<tmp.length(); i++){
            char c = tmp.charAt(i);
            list.add((char)('a' + (c - '0')));      
        }
        
        for(int i=0; i<list.size(); i++)
            answer += list.get(i);
        
        return answer;
    }
}