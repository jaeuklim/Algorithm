class Solution {
    public String solution(String myString) {
        String answer = "";
        
        for(char c : myString.toCharArray()){
            if(c=='a' || c=='A')
                answer += Character.toString(c).toUpperCase();
            else
                answer += Character.toString(c).toLowerCase();
            
            
        }

        return answer;
    }
}