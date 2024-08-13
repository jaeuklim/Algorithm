import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        int num = 0;
        int cnt = 0;
        for(int i : number)
            num += i;
        
        while(cnt<=discount.length-num){
            int []tmp = Arrays.copyOf(number, number.length);
            boolean check = true;
            
            for(int i=cnt; i<cnt+num; i++){
                for(int j=0; j<want.length; j++){
                    if(discount[i].equals(want[j]))
                        tmp[j]--;
                }
            }
            
            for(int i : tmp){
                if(i!=0){
                    check = false;
                    break;
                }
                    
            }
            
            if(check)
                answer++;
            
            cnt++;
        }
        
        return answer;
    }
}