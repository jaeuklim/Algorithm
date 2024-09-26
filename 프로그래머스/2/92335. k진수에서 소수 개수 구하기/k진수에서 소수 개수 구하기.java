class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        String tmp = Integer.toString(n, k);
        String []tmp1 = tmp.split("0");
        
        for(String s: tmp1){
            if(s.equals("") || s.equals("1"))
                continue;
            
            long num = Long.parseLong(s);
            boolean check = true;
            
            for(long i=2; i*i<=num; i++){
                if(num%i==0){
                    check = false;
                    break;
                }
            }
            
            if(check)
                answer++;         
        }
        
        return answer;
    }
}