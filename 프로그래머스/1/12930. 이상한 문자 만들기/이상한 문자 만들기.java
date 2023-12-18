import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[]tmp;
        List<String> list = new ArrayList<>();
        int index = 0;
        
        tmp = s.split(""); //공백을 기준으로 split
        for(int i = 0; i<tmp.length; i++){
            if(tmp[i].equals(" ")){ //" "가 있으면 list에 넣어주고 index 초기화
                list.add(" ");
                index = 0;
            }
            else{
                if(index%2==0)
                    list.add(tmp[i].toUpperCase());  //짝수면 대문자로 바꿔 넣음
                else
                    list.add(tmp[i].toLowerCase());  //홀수면 소문자로 바꿔 넣음
                
                index++;
            }           
        }        
        answer = String.join("", list);
        
        return answer;
    }
}