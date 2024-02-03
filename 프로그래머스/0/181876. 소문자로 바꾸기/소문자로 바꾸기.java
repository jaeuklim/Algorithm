class Solution {
    public String solution(String myString) {
        String answer = "";
        
        for(char tmp : myString.toCharArray()){
            answer += Character.toLowerCase(tmp);
        }
        return answer;
    }
}