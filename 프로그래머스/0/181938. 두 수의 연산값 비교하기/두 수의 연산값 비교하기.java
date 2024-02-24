class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        answer = Integer.parseInt(Integer.toString(a)+Integer.toString(b));
        
        if(answer>(2*a*b))
            return answer;
        else
            return a*b*2;
        
    }
}