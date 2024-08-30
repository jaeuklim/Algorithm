import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];;
        
        for(int i=0; i<queries.length; i++){
            for(int j=queries[i][0]; j<=queries[i][1]; j++){
                if(arr[j]>queries[i][2]){
                    if(answer[i]==0)
                        answer[i]=arr[j];
                    else
                        answer[i] = Math.min(arr[j], answer[i]);
                }
            }
            
            if(answer[i]==0)
                answer[i]=-1;
        }
        return answer;
    }
}