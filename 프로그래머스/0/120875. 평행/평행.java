class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int x1 = dots[0][0];
        int x2 = dots[1][0];
        int x3 = dots[2][0];
        int x4 = dots[3][0];
        int y1 = dots[0][1];
        int y2 = dots[1][1];
        int y3 = dots[2][1];
        int y4 = dots[3][1];
        
        if((double)(y4-y3)/(x4-x3) == (double)(y2-y1)/(x2-x1))
            answer = 1;
        else if((double)(y4-y2)/(x4-x2) == (double)(y3-y1)/(x3-x1))
            answer = 1;
        else if((double)(y4-y1)/(x4-x1) == (double)(y3-y2)/(x3-x2))
            answer = 1;
        
        return answer;
    }
}