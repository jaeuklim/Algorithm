import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer;
        int[] supo1 = {1, 2, 3, 4, 5};                  //각각 수포자들의 정답 패턴 저장
        int[] supo2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] supo3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] anssupo = new int[3];
        int max;
        List<Integer> list = new ArrayList<>();
        
        anssupo[0] = Answer(answers, supo1);            //Answer메소드에 넘겨 수포자별 정답 수를 anssupo배열에 저장
        anssupo[1] = Answer(answers, supo2);
        anssupo[2] = Answer(answers, supo3);
        
        max = Math.max(anssupo[0], Math.max(anssupo[1], anssupo[2]));   //수포자 중 최고 정답 개수 저장
        
        for (int i = 0; i < anssupo.length; i++) {
            if (anssupo[i] == max) {                // 최고 정답 개수에 해당하는 수포자 번호를 차례대로 리스트에 저장
                list.add(i + 1);
            }
        }
        
        answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++)
            answer[i] = list.get(i);        
        
        return answer;
    }
    
    public int Answer(int[] answers, int[] supo){
        int[] tmp = new int[answers.length];
        int size = supo.length;
        int j = 0;
        int answer =0;
        
        for(int i = 0; i<answers.length; i++){  //수포자의 정답패턴을 반복저장하여 수포자의 답안지 tmp를 만듬
            tmp[i] = supo[j];
            j++;
            if(j>=size)
                j = 0;
        }
        
        for(int i = 0; i<answers.length; i++){
            if(answers[i]==tmp[i])              //답안이 일치할때마다 answer 증가
                answer++;
        }
        
        return answer;           
    }
}