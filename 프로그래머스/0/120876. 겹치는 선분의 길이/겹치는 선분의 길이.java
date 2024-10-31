class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] linecounts = new int[201];
        
        for(int[] line : lines){
            for(int i=line[0]+100; i<line[1]+100; i++)
                linecounts[i]++;
        }
        
        
        for(int i=0; i<linecounts.length; i++)
            if(linecounts[i]>1)
                answer++;
        
        return answer;
    }
}