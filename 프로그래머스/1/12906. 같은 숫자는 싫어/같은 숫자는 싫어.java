import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Queue<Integer> queue = new LinkedList<>();
        
        queue.add(arr[0]);
        
        for(int i = 1; i<arr.length; i++){
            if(arr[i]!=arr[i-1])            //이전 값과 중복되지 않으면 큐에 값 삽입
                queue.add(arr[i]);       
        }
        
        int[] answer = new int[queue.size()];
        
        for(int i = 0; i<answer.length; i++)
            answer[i]=queue.remove();  //큐의 맨 앞에 위치한 값부터 저장 후 제거

        return answer;
    }
}