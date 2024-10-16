import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int maxbin = 0;
        int bindo = 0;
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i : array){
            bindo = map.getOrDefault(i,0) +1;
            
            if(bindo>maxbin){
                maxbin = bindo;
                answer = i;
            }
            else if(bindo==maxbin)
                answer = -1;
            
            map.put(i, bindo);
        }
        
        return answer;
    }
}