class Solution {
    public int[] solution(int[] arr) {        
        int pow = 1;
        
        while(true){
            if(arr.length>pow)
                pow*=2;
            else
                break;
        }
        
        int[] answer = new int[pow];
        
        for(int i=0; i<arr.length; i++)
                answer[i]=arr[i];

        
        return answer;
    }
}