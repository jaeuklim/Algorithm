class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for(char tmp : my_string.toCharArray()){
            if(Character.isLowerCase(tmp))
                answer += Character.toUpperCase(tmp);
            else
                answer += Character.toLowerCase(tmp);
        }
        
        return answer;
    }
}