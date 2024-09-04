import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i<progresses.length; i++){
            if((100-progresses[i]) % speeds[i] == 0)
                queue.add((100-progresses[i]) / speeds[i]);
            else
                queue.add((100-progresses[i]) / speeds[i] +1);
        }
        
        int tmp = queue.poll();
        int num = 1;
        
        while(queue.size()>0){
            int tmp2 = queue.poll();
            
            if(tmp>=tmp2)
                num++;
            else{
                list.add(num);
                num = 1;
                tmp = tmp2;
            }
        }
        
        list.add(num);
        
        int[] answer = new int[list.size()];
        
        for(int i=0; i<list.size(); i++)
            answer[i] = list.get(i);
        
        return answer;
        
    }
}