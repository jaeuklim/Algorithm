class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String tmp = "";
        
        for(char c : myString.toCharArray()){
            if(c == 'A')
                tmp += 'B';
            else
                tmp += 'A';
        }
        
        if(tmp.contains(pat))
            answer=1;
        else
            answer=0;
        
        return answer;
    }
}