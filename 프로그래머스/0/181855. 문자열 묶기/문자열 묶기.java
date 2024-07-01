import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<strArr.length; i++)
            map.put(strArr[i].length(), map.getOrDefault(strArr[i].length(), 0) + 1);
        
        for(int i : map.values())
            if(i>answer)
                answer=i;
 
        return answer;
    }
}