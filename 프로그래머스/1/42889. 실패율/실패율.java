import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        double[] tmp = new double[N+1];
        int[] stay = new int[N + 2];
        int people = stages.length;
        double max;
        int index;
        
        for (int stage : stages) {
            stay[stage]++; //각 스테이지별 실패자 수를 인덱스 위치에 맞게 저장
        }
        
        for(int i =1; i<=N; i++){
            if(people!=0)
                tmp[i] = (double)stay[i]/(double)people;  //1~N층의 실패율을 tmp에 저장
            else
                tmp[i] = 0;
            
            people = people - stay[i];
        }
        
        for(int i = 0; i<N; i++){
            max = -1;
            index = -1;
            for(int j= 1; j<=N; j++){
                if(tmp[j] > max){
                    max = tmp[j]; 
                    index = j;  //실패율의 최대값의 위치를 index위치에 저장
                }            
            }
            tmp[index] = -1;     //한번 측정한 max값을 최소값으로 초기화    
            answer[i] = index;  //최대 값의 인덱스 위치는 해당 스테이지 위치이므로 answer에 저장
        }
        
        return answer;
    }
}