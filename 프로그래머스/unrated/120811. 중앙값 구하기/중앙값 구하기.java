import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int c_index = array.length/2;
        
        Arrays.sort(array);
        answer = array[c_index];
        
        return answer;
    }
}