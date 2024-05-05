class Solution {
    public int solution(String number) {
        int answer = 0;
        int total = 0;
        for(char c : number.toCharArray()){
            total += (c - '0');
        }
        answer = total % 9;
        
        return answer;
    }
}