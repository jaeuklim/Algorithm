import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        int []tmp = new int[10000001];
        int num = 0;
    
        for(int i : tangerine)
            tmp[i]++;
        
        Arrays.sort(tmp);
        
        for(int i=tmp.length-1; i>=0; i--){
            answer++;
            num += tmp[i];
            if(num>=k)
                break;
            
        }
            
        return answer;
    }
}