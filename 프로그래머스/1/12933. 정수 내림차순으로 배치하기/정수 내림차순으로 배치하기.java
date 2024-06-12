import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String tmp = n + "";
        String[] tmp1 = tmp.split("");
        String tmp2 = "";
        
        Arrays.sort(tmp1);
        
        for(int i=tmp1.length-1; i>=0; i--)
            tmp2 += tmp1[i];
                
        answer = Long.parseLong(tmp2);
        
        return answer;
    }
}