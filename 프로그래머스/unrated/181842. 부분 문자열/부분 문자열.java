class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        
        // for(int i=0; i<=str2.length()-str1.length(); i++){
        //     String tmp = str2.substring(i,i+str1.length());
        //     if(tmp.equals(str1))
        //         answer = 1;
        // }
        
        if(str2.contains(str1))
            answer = 1;
        
        return answer;
    }
}