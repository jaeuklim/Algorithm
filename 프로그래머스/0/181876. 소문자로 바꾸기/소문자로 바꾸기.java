class Solution {
    public String solution(String myString) {
        StringBuilder answer = new StringBuilder();
        
        for(char tmp : myString.toCharArray()){
            answer.append(Character.toLowerCase(tmp));
        }
        return answer.toString();
    }
}