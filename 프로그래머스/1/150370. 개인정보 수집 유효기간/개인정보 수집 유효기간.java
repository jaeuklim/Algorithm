import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        int[] answer;
        String[] tmp = new String[2];
        String[] today2 = new String[3];
        String[] priv2 = new String[3];
        int[] today3 = new int[3];
        int[] priv3 = new int[3];
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i<terms.length; i++){  //약관종류에 따른 유효기간을 해쉬맵에 저장
            tmp = terms[i].split(" ");
            map.put(tmp[0], Integer.parseInt(tmp[1]));
        }
        
        today2 = today.split("\\.");    //오늘 날짜를 .을 기준으로 잘라 년/월/일 형태로 저장하고 계산하기 쉽게 정수화
        for(int i=0; i<today2.length; i++)
            today3[i] = Integer.parseInt(today2[i]);
            
        
        for(int i=0; i<privacies.length; i++){
            tmp = privacies[i].split(" ");  //약관 종류와 수집일자 형태를 분리 저장
            priv2 = tmp[0].split("\\.");
            
            for(int j=0; j<priv2.length; j++)   //수집 일자를 .을 기준으로 자르고 정수화
                priv3[j] = Integer.parseInt(priv2[j]);
            
            priv3[1] = priv3[1] + map.get(tmp[1]);  //해쉬맵에 저장된 유효기간을 수집일자(달)에 더해 유효기간(달) 저장
            priv3[2] = priv3[2] - 1; //유효기간(일) 계산
            
            if(priv3[2]==0){    //0일이면 28일로 치환하고 월을 줄여줌
                priv3[2]=28;
                priv3[1]-=1;
            }
            if(priv3[1]>12){   //총합이 12월을 초과하는 경우 그 초과하는 햇수만큼 기존 년에 더해 저장 
                priv3[0]+=(priv3[1]/12);
                priv3[1]=priv3[1]- 12*(priv3[1]/12);
            }
            if(priv3[1]==0){    //0월이면 12월로 치환하고 년을 줄여줌
                priv3[0]-=1;
                priv3[1]=12;
            }
            
            if(today3[0]>priv3[0])  //오늘 날짜와 유효기간을 년/월/일 순으로 비교하여 파기할 개인정보 번호 저장
                list.add(i+1);
            else if(today3[0]==priv3[0] && today3[1]>priv3[1])
                list.add(i+1);
            else if(today3[0]==priv3[0] && today3[1]==priv3[1] && today3[2]>priv3[2])
                list.add(i+1);
        }
        
        answer = new int[list.size()];
        for(int i =0; i<answer.length; i++)
            answer[i]=list.get(i);
        
        return answer;
    }
}