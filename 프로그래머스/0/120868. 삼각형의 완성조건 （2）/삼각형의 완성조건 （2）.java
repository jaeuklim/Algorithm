import java.util.*;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        Arrays.sort(sides);
        
        answer+=sides[0];
        
        for(int i=sides[1]+1; i<sides[0]+sides[1]; i++)
            answer++;
        
        return answer;
    }
}