import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();
        
        for(int i=l; i<=r; i++){
            String s = Integer.toString(i);
            boolean check = true;
            
            for(char c : s.toCharArray()){
                if(c == '5' || c =='0')
                    check = true;
                else{
                    check = false;
                    break;
                }                    
            }
            
            if(check)
                list.add(Integer.parseInt(s));
        }
        
        if(list.isEmpty())
            return new int[] {-1};
        
        int[] answer = new int[list.size()];
        
        for(int i=0; i<answer.length; i++)
            answer[i] = list.get(i);
        
        return answer;
    }
}