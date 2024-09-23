import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        int min = Integer.MAX_VALUE;
        int index = 0;
        List<Integer> list = new ArrayList<>();
        
        while(list.size()<3){
            for(int i=0; i<rank.length; i++){
                if(rank[i]<min){
                    min = rank[i];
                    index = i;
                }
            }
            
            if(attendance[index])
                list.add(index);
                          
            rank[index] = Integer.MAX_VALUE;
            min = Integer.MAX_VALUE;
        }
        
        answer = 10000*list.get(0) + 100*list.get(1) + list.get(2);
        
        return answer;
    }
}