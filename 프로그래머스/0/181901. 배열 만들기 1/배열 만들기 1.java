import java.util.*;

class Solution {
    public int[] solution(int n, int k) {
        int[] answer = new int[n/k];
        List<Integer> list = new ArrayList<>();
        
        for(int i=1; i<=n; i++){
            if(i%k==0){
                list.add(i);
            }
        }
        
        for(int j=0; j<list.size(); j++)
            answer[j] = list.get(j);
        
        return answer;
    }
}