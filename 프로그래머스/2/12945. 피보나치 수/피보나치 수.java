class Solution {
    public int solution(int n) {
        int answer = 0;
        
        answer = pibo(n);
        
        return answer;
    }
    
    public int pibo(int n){
        if(n==1)
            return 1;
        else if(n==0)
            return 0;
        
        int prev2 = 0;
        int prev1 = 1;
        int total = 0;

        for (int i = 2; i <= n; i++) {
            total = (prev1 + prev2) % 1234567;
            prev2 = prev1;
            prev1 = total;
        }
        
        return total;
    }
}