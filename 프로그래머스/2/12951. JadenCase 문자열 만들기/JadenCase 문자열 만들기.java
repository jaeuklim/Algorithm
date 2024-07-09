import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        String []tmp = s.trim().split(" ");
        
        for(int i=0; i<tmp.length; i++){
            
            if(tmp[i].length()==0){
                answer+=" ";
                continue;
            }
                
            if(Character.isDigit(tmp[i].charAt(0)))
                answer += tmp[i].toLowerCase();
            else{
                answer += (tmp[i].charAt(0)+"").toUpperCase() + tmp[i].substring(1,tmp[i].length()).toLowerCase();
            }

            if(i < tmp.length-1)
                answer += " ";
        }
        
        if(s.charAt(s.length()-1) == ' ')
            answer += " ";

        return answer;
    }
}