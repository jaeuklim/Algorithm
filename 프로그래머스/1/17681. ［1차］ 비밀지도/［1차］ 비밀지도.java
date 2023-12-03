import java.util.*;
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        int[] tmp1 = new int[n];
        int[] tmp2 = new int[n];
        
        for (int i = 0; i < n; i++) //answer을 빈 배열로 초기화
            answer[i] = "";
        
        for(int i= 0; i<n; i++){
            tmp1 = binary(n,arr1[i]);
            tmp2 = binary(n,arr2[i]);
            
            for(int j=0; j<n; j++){
                if(tmp1[j]==1 || tmp2[j]==1)  //하나라도 1이 있으면 벽
                    answer[i] += "#";
                else                          //둘다 0아면 공백
                    answer[i] += " ";
            }
            System.out.println(answer[i]);
        }
                    
        return answer;
    }
    
    public int[] binary(int n, int num){
        int []binary = new int[n];
        int []answer = new int[n];
        
        binary[n-1]=1;
        for(int i=n-2; i>=0; i--)
            binary[i]=binary[i+1]*2;  // n=5인 경우{16,8,4,2,1} 형태의 이진수 배열 생성
        
        for(int i=0; i<n; i++){
            if(num/binary[i]==1){ // 이진수 배열로 나눠 더 크면 1저장
                answer[i]=1;
            }
            else              // 작으면 0 저장
                answer[i]=0;
            
            num = num%binary[i]; 
        }
        
        return answer;            
    }
}