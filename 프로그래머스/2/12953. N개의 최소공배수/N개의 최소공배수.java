import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int answer=0;
        
        Arrays.sort(arr);
        
        for(int i=0; i<arr.length-1; i++){
            int num = gcd(arr[i+1],arr[i]);
            arr[i+1] = (arr[i+1]*arr[i]) / num;
        }

        answer = arr[arr.length-1];
        
        return answer;
    }
    
    public int gcd(int a, int b){
        if(a%b==0)
            return b;
        else
            return gcd(b,a%b);
    }
}