import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int num = 0;
        Queue<Character> queue = new LinkedList<>();
        
        // tmp = s.split("");                 //효율성 측면에서 시간복잡도가 좋지 않은 방식.  
        // for(int i = 0; i<s.length(); i++)
        //     queue.offer(tmp[i]);
        
        for(char tmp : s.toCharArray()){
            if(tmp == '('){
                queue.offer(tmp);       // 큐에 ( 를 넣음
                num++;
            }
            else{
                if(queue.isEmpty())    // 큐에 ( 가 없는데 ) 가 들어오면 올바르지 않은 경우므로 false 리턴
                    return false;
                queue.poll();          // (가 있는데 )가 들어오면 올바른 괄호라고 판단하여 (를 큐에서 제거
                num--;
            }
        }
        
        if(num==0)            // 모든 괄호가 올바르고 (와 )의 개수가 동일하면 true.
            answer = true;
        else
            answer = false;
        
        return answer;
    }
}