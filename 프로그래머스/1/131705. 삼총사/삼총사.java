class Solution {
    public int solution(int[] number) {
        int answer = 0;
        int total;
        int k = 0;
        
        while(k<number.length){            
            for(int i = k+1; i<number.length; i++){
                for(int j =i+1; j<number.length; j++){
                    total = number[k] + number[i] + number[j]; //중복되지 원소 3개를 선택하여 그 합을 total에 저장            
                    if(total==0)   //total이 0이면 경우의수++
                        answer++;
                }
            }
            k++;
        }
        return answer;
    }
}