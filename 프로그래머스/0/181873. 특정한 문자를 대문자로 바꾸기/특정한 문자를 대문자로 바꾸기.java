class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        String tmp[] = my_string.split("");
        
        for(int i=0; i<tmp.length; i++){
            if(tmp[i].equals(alp))
                answer += tmp[i].toUpperCase();
            else
                answer += tmp[i];
        }
        return answer;
    }
}