class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int tmp = emergency[0];
        int index = 0;
        int num = 1;
        
        while(num<=emergency.length){
            for(int i=0; i<emergency.length; i++){
                if(tmp<emergency[i]){
                    tmp = emergency[i];
                    index = i;
                }
            }
            
            answer[index] = num;
            emergency[index] = -1;
            num++;
            tmp = 0;
            
        }
        
        return answer;
    }
}