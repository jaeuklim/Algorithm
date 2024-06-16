import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int num = Integer.MAX_VALUE;
        
        Arrays.sort(array);
        
        for(int i=0; i<array.length; i++){
            if(Math.abs(array[i]-n)<num){
                num = Math.abs(array[i]-n);
                answer =array[i];
            }
            else if(Math.abs(array[i]-n)==num){
                num = Math.abs(array[i]-n);
                answer = Math.min(array[i], answer);
                
            }
            
        }
        return answer;
    }
}