class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for(char tmp : my_string.toCharArray()){
            if(Character.isLowerCase(tmp)){
                char c = Character.toUpperCase(tmp);
                answer += Character.toString(c);
                
            }
            else{
                char c = Character.toLowerCase(tmp);
                answer += Character.toString(c);
            }
        }
        
        return answer;
    }
}