class Solution {
    public String solution(String rsp) {
        String answer = "";
        
        for(char tmp : rsp.toCharArray()){
            if(tmp == '2')
                answer += '0';
            else if(tmp == '0')
                answer += '5';
            else
                answer += '2';                
        }
        
        return answer;
        
        
    }
}