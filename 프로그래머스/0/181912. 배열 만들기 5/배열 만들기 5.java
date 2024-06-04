import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> list = new ArrayList<>();
        
        for(String c : intStrs){
            String tmp = c.substring(s,s+l);
            
            if(Integer.parseInt(tmp)>k)
                list.add(Integer.parseInt(tmp));
        }
        
        int[] answer = new int[list.size()];
        
        for(int i=0; i<list.size(); i++)
            answer[i] = list.get(i);                        
        
        return answer;
    }
}