import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        String [] tmp = my_string.split(" ");
        List<String> list = new ArrayList<>();
        
        for(String s : tmp)
            if(!s.equals(""))
                list.add(s);
        
        String[] answer = new String[list.size()];
        for(int i=0; i<list.size(); i++)
            answer[i]=list.get(i);
        
        return answer;
    }
}