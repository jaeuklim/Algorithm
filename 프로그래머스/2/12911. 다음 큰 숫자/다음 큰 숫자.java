class Solution {
    public int solution(int n) {
        int answer = 0;
        String tmp = Integer.toBinaryString(n);
        int num = 0;
        
        for(char c : tmp.toCharArray()){
            if(c == '1')
                num++;
        }

        while(true){
            n++;
            tmp = Integer.toBinaryString(n);
            int n_num = 0;
            
            for(char c : tmp.toCharArray()){
                if(c == '1')
                    n_num++;
            }
            
            if(num == n_num){
                answer = n;
                break;
            }            
        }
        
        return answer;
    }
}