class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        int i=c-1;
        
        while(i<my_string.length()){
            answer += my_string.charAt(i);
            i += m;
        }
        return answer;
    }
}