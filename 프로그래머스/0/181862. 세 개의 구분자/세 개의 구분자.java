import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        
        String[] tmp = myStr.split("[a-c]");
        List<String> list = new ArrayList<>();
        
        for(String s : tmp)
            if(!s.equals(""))
                list.add(s);
        
        if(list.isEmpty())
            list.add("EMPTY");
        
        String[] answer = new String[list.size()];

        for(int i=0; i<answer.length; i++)
            answer[i]=list.get(i);        
        
        return answer;
    }
}