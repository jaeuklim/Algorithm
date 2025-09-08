import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        String []aeiou = {"a","e","i","o","u"};
        List<String> list = Arrays.asList(aeiou);
        
        for(int i=0; i<my_string.length(); i++){
            char tmp = my_string.charAt(i);
            
            if(list.contains(Character.toString(tmp)))
                continue;
            else
                answer += Character.toString(tmp);                           
        }
        
        return answer;
    }
}