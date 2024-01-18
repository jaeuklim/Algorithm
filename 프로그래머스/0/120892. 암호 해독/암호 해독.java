class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        
        for(int i = 0; i<cipher.length(); i++){
            if((i+1)%code==0){
                char tmp = cipher.charAt(i);
                answer += tmp;
            }            
        }
        return answer;
    }
}