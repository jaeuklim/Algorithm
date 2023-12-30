class Solution {
    public int solution(int n) {
        int answer = 0;
        
        while(true){
            answer++;
            
            if(answer*answer==n)
                return 1;
            else if(answer*answer<n)
                continue;
            else
                return 2;
        }
    }
}