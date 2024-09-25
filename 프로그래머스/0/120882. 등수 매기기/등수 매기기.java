class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        int[] sum = new int[score.length];
        int rank = 1;
        int index = 0;
        
        for(int i=0; i<score.length; i++){
            sum[i] = score[i][0] + score[i][1];
        }
        
        while(rank<=sum.length){
            int max = Integer.MIN_VALUE;
            int num = 1;
            
            for(int i=0; i<sum.length; i++){
                if(max<sum[i]){
                    index = i;
                    max = sum[i];
                }
            }
            
            sum[index] = Integer.MIN_VALUE;
            answer[index] = rank;
            
            for(int i=0; i<sum.length; i++){
                if(sum[i]==max){
                    answer[i]=rank;
                    sum[i] = Integer.MIN_VALUE;
                    num++;
                }       
            }
            
            rank += num;
        }
        
        return answer;
    }
}