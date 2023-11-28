class Solution {
    public int solution(int[][] sizes) {
        int answer;
        int maxW=0;
        int maxH=0;
        int x,y;
        
        for(int i = 0; i<sizes.length; i++){
            x = Math.max(sizes[i][0],sizes[i][1]); //가로변 세로변 중 더 큰 변 저장
            y = Math.min(sizes[i][0],sizes[i][1]); //가로변 세로변 중 더 작은 변 저장
            maxW = Math.max(maxW,x); //큰 변 중 제일 큰 수 저장
            maxH = Math.max(maxH,y); //작은 변 중 제일 큰 수 저장
        }
        
        answer = maxW*maxH;
        
        return answer;
    }
}