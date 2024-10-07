import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        int[] tmp = new int[numlist.length];
        List<Integer> list = new ArrayList<>();
        int near = Integer.MAX_VALUE;
        int index = 0;
        int k=0;
        
        for(int i=0; i<tmp.length; i++)
            tmp[i] = Math.abs(n-numlist[i]);
        
        while(k<answer.length){
            for(int i=0; i<tmp.length; i++){
                if(tmp[i]<near){
                    index = i;
                    near = tmp[i];
                }                    
                else if(near==tmp[i]){
                    if(numlist[index]> numlist[i])
                        near = tmp[index];
                    else{
                        near = tmp[i];
                        index = i;
                    }
                }
            }
            
            tmp[index] = Integer.MAX_VALUE;
            near = Integer.MAX_VALUE;
            answer[k++] = numlist[index];
        }
            
        return answer;
    }
}