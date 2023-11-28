class Solution {
    
    public void DFS(int i, int j, int[][] safeboard){
        int [][]check = {{-1,-1},{0,-1},{1,-1},{-1,0},{1,0},{-1,1},{0,1},{1,1}}; // 상하좌우, 대각선으로 이동할수 있는 값을 가진 배열 선언
        int x,y;
        
        for(int k = 0; k< check.length; k++){ 
            x = i + check[k][0]; 
            y = j + check[k][1];
            
            if(x>=0 && x< safeboard.length && y>=0 && y<safeboard.length) //safeboard의 범위를 벗어나지 않는 경우
                if(safeboard[x][y]!=1) // 지뢰 위치는 보존하도록 조건문 추가
                    safeboard[x][y] = 2; //위험 지역으로 표기
        }
    }
    
    public int solution(int[][] board) {
        int answer=0;
        int [][]safeboard = new int[board.length][board.length]; //안전지역 배열 선언
        
        for(int i = 0; i<board.length; i++){
            for(int j =0; j<board.length; j++){
                if(board[i][j] == 1){
                    safeboard[i][j] = 1; // 지뢰 위치 복사
                    DFS(i,j,safeboard);  // 지뢰 위치와 안전지역을 넘겨줌
                }
            }
        }
        
        for(int i = 0; i<safeboard.length; i++){
            for(int j =0; j<safeboard.length; j++){
                if(safeboard[i][j]==0)  // 안전한 지역 카운팅
                    answer++;
            }
        }

        return answer;
    }
}