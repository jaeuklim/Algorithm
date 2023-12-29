class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        
        for(int i=0; i<my_string.length(); i++){
            char tmp = my_string.charAt(i);
            if(Character.toString(tmp).equals(letter))
                continue;
            else
                answer +=tmp;
        }
        return answer;
    }
}