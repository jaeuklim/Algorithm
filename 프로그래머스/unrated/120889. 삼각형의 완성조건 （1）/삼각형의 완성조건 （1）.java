class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        if(sides[0]+sides[1]>sides[2] && sides[0]+sides[2]>sides[1] && sides[1]+sides[2]>sides[0])
            return 1;
        else
            return 2;
        
    }
}