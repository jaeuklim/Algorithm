import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int[] answer = new int[intervals[0][1]-intervals[0][0]+intervals[1][1]-intervals[1][0]+2];
        int[] tmp1 = Arrays.copyOfRange(arr, intervals[0][0], intervals[0][1]+1);
        int[] tmp2 = Arrays.copyOfRange(arr, intervals[1][0], intervals[1][1]+1);
        int index=0;
        
        for(int i=0; i<answer.length; i++){            
            if(i>=tmp1.length){
                answer[i]=tmp2[index];
                index++;            
            }
            else
                answer[i]=tmp1[i];
        }
        return answer;
    }
}