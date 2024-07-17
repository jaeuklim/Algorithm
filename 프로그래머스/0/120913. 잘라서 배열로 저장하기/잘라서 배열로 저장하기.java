import java.util.*;

class Solution {
    public String[] solution(String my_str, int n) {
        int size = my_str.length()%n==0 ? my_str.length()/n : my_str.length()/n+1;
        String[] answer = new String[size];;
        Arrays.fill(answer, "");
        int i=0;
        
        for(char c: my_str.toCharArray()){
            answer[i] += c;
            if(answer[i].length()==n)
                i++;                
        }
        
        return answer;
    }
}