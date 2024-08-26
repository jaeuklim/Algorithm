import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        List<Integer> list = new ArrayList<>();
        
        for(int i : arr){
            if(!list.contains(i))
                list.add(i);
        }
        
        for(int i=0; i<k; i++){
            if(i<list.size())
                answer[i] = list.get(i);
            else
                answer[i] = -1;            
        }
        
        return answer;
    }
}