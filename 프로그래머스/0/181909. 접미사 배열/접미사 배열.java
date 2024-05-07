import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        ArrayList<String> list = new ArrayList<>();
        String tmp;
        
        for(int i=0; i<my_string.length(); i++){
            tmp = my_string.substring(i,my_string.length());
            list.add(tmp);
        }

        String[] answer = new String[list.size()];
        
        for(int i=0; i<answer.length; i++)
            answer[i] = list.get(i);

        Arrays.sort(answer);
        
        return answer;
    }
}