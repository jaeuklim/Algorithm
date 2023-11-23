class Solution {
    public String solution(String s, int n) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        char tmp;
        char tmp2;
        
        
        for(int i = 0; i<s.length(); i++){
            tmp = s.charAt(i);
            
            if(Character.isUpperCase(tmp))
                tmp2 = (char)('A' + (tmp+n-'A')%26);
            else if(Character.isLowerCase(tmp))
                tmp2 = (char)('a' + (tmp+n-'a')%26);
            else{
                sb.append(tmp);
                continue;
            }
            
            sb.append(tmp2);
        }
 
        answer = sb.toString();
        return answer;
    }
}