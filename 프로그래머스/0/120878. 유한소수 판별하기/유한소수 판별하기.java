class Solution {
    public int solution(int a, int b) {
        int answer = 1;
        int mult = b / mult(b,a);
        
        while(mult>1){
            if(mult%2==0)
                mult=mult/2;
            else if(mult%5==0)
                mult=mult/5;
            else
                return 2;
        }
        
        return answer;
    }
    
    public int mult(int a, int b){
        if(a%b==0)
            return b;
        
        return mult(b, a%b);
    }
}