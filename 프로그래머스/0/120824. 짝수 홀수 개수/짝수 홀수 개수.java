class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];        
        int i = 0;
        int j = 0;
        
        for(int k=0; k<num_list.length; k++){
            if(num_list[k]%2== 0)
                i++;
            else
                j++;
        }
        
        answer[0] = i;
        answer[1] = j;
        
        return answer;
    }
}