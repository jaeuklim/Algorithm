import java.util.*;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        for(char tmp : my_string.toCharArray()){
            if(Character.isDigit(tmp))
                answer+=Character.getNumericValue(tmp);
        }
        return answer;
    }
}