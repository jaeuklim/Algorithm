class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        if(myString.toUpperCase().contains(pat.toUpperCase()))
            return 1;
        else
            return 0;
        
    }
}