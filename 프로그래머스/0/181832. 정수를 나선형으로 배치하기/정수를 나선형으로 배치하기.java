class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        boolean[][] visited = new boolean[n][n];
        int[] x = {0,1,0,-1};
        int[] y = {1,0,-1,0};
        int start = 1;
        int nx=0;
        int ny=0;
        
        answer[nx][ny] = start;
        visited[nx][ny] = true;
        
        while(true){
            for(int k=0; k<x.length; k++){
                while(true){
                    nx += x[k];
                    ny += y[k];
                    
                    if(nx<0 || nx>=n || ny<0 || ny>=n || visited[nx][ny]==true){
                        nx -= x[k];
                        ny -= y[k];
                        break;
                    }
                    
                    start++;
                    answer[nx][ny] = start;
                    visited[nx][ny] = true;
                }          
            }
            
            if(start==n*n)
                break;
        }
        
        return answer;
    }
}