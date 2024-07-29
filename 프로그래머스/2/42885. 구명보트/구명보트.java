import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int last = 0;
        
        Arrays.sort(people);
        
        for(int i=people.length-1; i>=last; i--){
            if(people[i]+people[last]<=limit){
                answer++;
                last++;
            }
            else
                answer++;
                
        }
        
        return answer;
    }
}