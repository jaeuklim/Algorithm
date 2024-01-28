class Solution {
    public int solution(int[] num_list) {
        int answer = 1;
        int total = 0;
        for(int i = 0; i<num_list.length; i++){
            answer *= num_list[i];
            total += num_list[i];            
        }
        
        if(answer< total*total)
            return 1;
        else
            return 0;
    }
}