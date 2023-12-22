import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int [commands.length];    
        int[] result;
        
        for(int i = 0; i<commands.length; i++){
            result = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]); //array배열의 특정 구간을 잘라서 result에 저장     
            Arrays.sort(result);  //정렬 작업 
            answer[i] = result[commands[i][2]-1]; //정렬된 배열에서 특정 값을 answer에 저장
        }
        
        return answer;
    }
}