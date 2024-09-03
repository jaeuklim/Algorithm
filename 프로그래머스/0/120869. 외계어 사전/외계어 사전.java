import java.util.*;

class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        
        Arrays.sort(spell);
        
        for(String s : dic){
            if(s.length()==spell.length){
                String[] tmp = s.split("");
                Arrays.sort(tmp);
                answer = 1;
                            
                for(int i=0; i<spell.length; i++){
                    if(!spell[i].equals(tmp[i])){
                        answer=2;
                        break;
                    }
                }
                
                if(answer==1)
                    return answer;
                    
            }       
        }
        return answer;
    }
} 