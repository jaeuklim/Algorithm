class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i=1; i<=n; i++){
            answer++;
            while(true){
                String tmp = Integer.toString(answer);                
                if(answer%3==0 || tmp.contains("3"))
                    answer++;
                else
                    break;                
            }              
        }
       
        return answer;
    }
}