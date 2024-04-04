class Solution {
    public String solution(String n_str) {
        String answer = "";
        boolean zero = false;
        
        if(n_str.charAt(0)=='0')
            zero = true;
        
        for(int i=0; i<n_str.length(); i++){
            if(zero==true && n_str.charAt(i)=='0')
                continue;
            else if(n_str.charAt(i)!='0'){
                answer += n_str.charAt(i);
                zero = false;
            }
            else
                answer += n_str.charAt(i);
        }
        
        return answer;
    }
}