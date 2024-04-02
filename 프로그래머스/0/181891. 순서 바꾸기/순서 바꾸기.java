class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        int index;
  
        
        for(int i=0; i<answer.length; i++){
            index = n % num_list.length;
            answer[i] = num_list[index];
            n++;
            
        }
        
        return answer;
    }
}