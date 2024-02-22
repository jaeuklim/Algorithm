class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String tmp1 = Integer.toString(a)+Integer.toString(b);
        String tmp2 = Integer.toString(b)+Integer.toString(a);
        
        answer = Math.max(Integer.parseInt(tmp1), Integer.parseInt(tmp2));
        return answer;
    }
}