import java.util.*;

class Solution {
    public String solution(int n, int t, int m, int p) {
        String answer = "";
        List<Character> list = new ArrayList<>();
        int num = 0;
        int turn = 1;
        
        while(list.size()<t){
            String tmp = Integer.toString(num, n);
            
            for(char c : tmp.toCharArray()){
                if(turn>m)
                    turn=1;
                
                if(turn==p)
                    list.add(c);

                turn++;
            }
            
            num++;
        }

        for(int i=0; i<t; i++)
            answer+=list.get(i);
        
        answer = answer.toUpperCase();
            
        return answer;
    }
}