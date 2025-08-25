class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        boolean tmp = str1.contains(str2); // str1문자열 속에 str2가 존재하면 true 를 반환 

        if(tmp)
            answer = 1;
        else
            answer = 2;
        
        return answer;
    }
}