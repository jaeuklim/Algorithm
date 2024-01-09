import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0,0};
        char tmp1, tmp2;
        List<String> list = new ArrayList<>();
        
        list.add(words[0]);

        for(int i=1; i<words.length; i++){
            tmp1 = words[i-1].charAt(words[i-1].length()-1); //이전 단어의 마지막 문자
            tmp2 = words[i].charAt(0);      //현재 단어의 첫번째 문자
            
            if(list.contains(words[i]) || tmp1!=tmp2){  //이미 말했던 단어이거나 단어가 이어지지 않는 경우
                answer[0]= i%n + 1;     //틀린 사람 번호
                answer[1]= i/n + 1;     //틀린 차례
                break;
            }
            
            list.add(words[i]); //문제 없으면 list에 추가
        }

        return answer;
    }
}