class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int total = brown+yellow;
        
        for(int i = 1; i<=brown; i++){
            if(total%i==0){     //i로 나눴을때 나머지가 0이면 i를 가로길이로 가지는 사각형으로 간주
                int j = total/i; // j는 세로길이
                if(brown==(i*2+(j-2)*2)){       //테두리의 개수를 구하는 공식과 brown 개수가 맞으면 answer에 저장.
                answer[0]=i;
                answer[1]=j;
                }
            }          
        }
        
        return answer;
    }
}