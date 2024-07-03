import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int startidx=0;
        int endidx=0;
        
        for(int i=0; i<arr.length; i++)
            if(arr[i]==2){
                startidx=i;
                break;
            }
        
        for(int i=arr.length-1; i>=0; i--)
            if(arr[i]==2){
                endidx=i;
                break;
            }
        
        for(int i=startidx; i<=endidx; i++)
            list.add(arr[i]);            
        
        int[] answer = new int[list.size()];
        
        if(!list.contains(2))
            answer[0]=-1;
        else{
            for(int i=0; i<answer.length; i++)
                answer[i]=list.get(i);            
        }
        
        return answer;
    }
}