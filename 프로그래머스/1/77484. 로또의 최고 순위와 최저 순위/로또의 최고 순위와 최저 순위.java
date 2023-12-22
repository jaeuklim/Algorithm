import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int[] lotto = {6,6,5,4,3,2,1}; //로또 등수 배열
        int same = 0;
        int zero = 0;
        
        Arrays.sort(lottos);
        Arrays.sort(win_nums);
        
        for(int i = 0; i<lottos.length; i++){
            for(int j=0; j<win_nums.length; j++){
                if(win_nums[j]==lottos[i])
                    same++;  //현재 일치하는 번호 개수
            }
            
            if(lottos[i]==0)
                zero++; // 알아볼수 없는 번호 개수
        }
        
        answer[0] = lotto[same+zero]; //최대로 맞춘 개수를 로또 배열에 넣어 최고 순위 저장
        answer[1] = lotto[same];      //최소로 맞춘 개수를 로또 배열에 넣어 최저 순위 저장
        
        return answer;
    }
}