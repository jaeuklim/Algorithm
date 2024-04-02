class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
//         int index;
  
        
        for(int i=0; i<answer.length; i++){
            if(n==answer.length)
                n=0;
            answer[i] = num_list[n];
            n++;
            
        }
        
        return answer;
    }
}