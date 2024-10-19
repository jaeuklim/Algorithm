class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int start = 0;
        
        while(true){
            int value = start;
            int sum = 0;
            
            for(int i=0; i<num; i++)
                sum += value++;
            
            if(sum<total)
                start++;
            else if(sum>total)
                start--;
            else
                break;                
        }
        
        for(int i=0; i<num; i++)
            answer[i] = start++;
        
        
        return answer;
    }
}