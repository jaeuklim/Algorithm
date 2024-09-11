import java.util.*;

class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int minh = 256;
        int minw = 256;
        int maxh = -256;
        int maxw = -256;
        
        for(int []tmp : dots){
            minw = Math.min(minw, tmp[0]);
            maxw = Math.max(maxw, tmp[0]);
            minh = Math.min(minh, tmp[1]);
            maxh = Math.max(maxh, tmp[1]);
        }
        
        answer = (maxh-minh)*(maxw-minw);
        
        return answer;
    }
}