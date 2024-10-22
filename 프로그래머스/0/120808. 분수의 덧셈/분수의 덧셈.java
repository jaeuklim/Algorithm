class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int gcd = 0;
        
        if(denom2>denom1)
            answer[1]  = (denom1*denom2)/gcd(denom2, denom1);
        else
            answer[1]  = (denom1*denom2)/gcd(denom1, denom2);
        
        answer[0] = numer1 * answer[1]/denom1 + numer2 * answer[1]/denom2;
        
        gcd = gcd(answer[0], answer[1]);
        
        answer[0] = answer[0] / gcd;        
        answer[1] = answer[1] / gcd;
        
        return answer;
    }
    
    public int gcd(int a, int b){
        if(a%b==0)
            return b;
        
        return gcd(b, a%b);
    }
}