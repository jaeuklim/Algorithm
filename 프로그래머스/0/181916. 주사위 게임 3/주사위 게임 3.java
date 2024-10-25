import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = Integer.MAX_VALUE;
        int[] num = {a,b,c,d};
        int[] tmp = new int[4];
        boolean check = false;
        int index = 0;
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i : num){
            int j = map.getOrDefault(i,0) + 1;
            map.put(i,j);
        }
        
        if(map.size()==1){
            for(int i : map.keySet())
                answer = 1111*i;
        }
        else if(map.size()==2){
            for(int i : map.keySet()){
                int value = map.get(i);
                
                if(value==2){
                    tmp[index++] = i;
                    check = true;
                }                               
                else if(value==3)
                    tmp[0] = i;      
                else if(value==1)
                    tmp[1] = i;
            }
            
            if(check)
                answer = (tmp[0]+tmp[1]) * Math.abs(tmp[0]-tmp[1]);
            else
                answer = (int)Math.pow(10*tmp[0]+tmp[1], 2);
        }
        else if(map.size()==3){
            for(int i : map.keySet()){
                int value = map.get(i);
                
                if(value==1)
                    tmp[index++] = i;
            }
            
            answer = tmp[0]*tmp[1];
        }
        else{
            for(int i : map.keySet())
                answer = Math.min(answer,i);
        }
        
        return answer;
    }
}