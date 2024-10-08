class Solution {
    int answer = 0;
    boolean[] visited;
    
    public int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];
        
        dfs(0, k, dungeons);
        
        return answer;
    }
    
    public void dfs(int cnt, int k, int[][] dungeons){        
        for(int i=0; i<dungeons.length; i++){
            if(visited[i]==false && dungeons[i][0]<=k){
                visited[i] = true;
                dfs(cnt+1, k-dungeons[i][1], dungeons);
                visited[i] = false;
            }
        }
        
        answer = Math.max(answer,cnt);
        
    }
}