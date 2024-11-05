class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int cola = 0;
        
        while(true){
            cola = n/a *b;
            answer += cola;            
            n = n%a + cola;
            
            if(n<a)
                break;
        }
        
        return answer;
    }
}