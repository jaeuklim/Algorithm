class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        
        for(int i=myString.length(); i>=pat.length(); i--){
            String tmp = myString.substring(i-pat.length(),i);
            
            if(tmp.equals(pat)){
                answer=myString.substring(0,i);
                break;
            }
                
        }
        return answer;
    }
}