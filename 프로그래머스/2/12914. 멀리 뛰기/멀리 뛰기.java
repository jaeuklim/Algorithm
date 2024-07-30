class Solution {
    public long solution(int n) {
        long answer = 0;
        
        if(n == 1) 
            return 1;
        
        long [] pibo = new long[n+1];
        pibo[0] = 0;
        pibo[1] = 1;
        pibo[2] = 2;
        
        for(int i=3; i<=n; i++)
            pibo[i] = (pibo[i-1] + pibo[i-2]) % 1234567;
        
        answer = pibo[n];
        
        return answer;
    }
}