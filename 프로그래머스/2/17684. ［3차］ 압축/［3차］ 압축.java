import java.util.*;

class Solution {
    public int[] solution(String msg) {
        List<String> list = new ArrayList<>();
        List<Integer> answerlist = new ArrayList<>();
        String wc = "";
        String lastwc = "";
        
        for(int i=0; i<26; i++)
            list.add(Character.toString('A'+i)); 
        
        for(int i=0; i<msg.length(); i++){
            wc += msg.charAt(i);
            
            if(list.contains(wc)){
                lastwc += msg.charAt(i);
                continue;
            }
            else{
                answerlist.add(list.indexOf(lastwc)+1);
                list.add(wc);
                wc = "";
                lastwc = "";
                i--;
            }            
        }
        
        answerlist.add(list.indexOf(wc)+1);
        
        int[] answer = new int[answerlist.size()];
        
        for(int i=0; i<answer.length; i++)
            answer[i] = answerlist.get(i);           
        
        return answer;
    }
}