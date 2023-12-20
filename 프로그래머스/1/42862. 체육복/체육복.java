import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length; //도둑맞지 않은 현재 체육복 보유한 학생 수
        int index;
        List<Integer> list = new ArrayList<>();
        
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        for(int i=0; i<reserve.length; i++) //여벌 체육복 보유한 여분 리스트 생성
            list.add(reserve[i]);
        
        for(int i=0; i<lost.length; i++){
            if(list.contains(lost[i])){     //본인이 도둑맞은 경우 본인 여분으로 대체
                index = list.indexOf(lost[i]);
                list.remove(index);         //여분 리스트에서 제외
                lost[i] = -1;               
                answer++;                   //옷을 구했으므로 보유 학생 수 증가
            }
        }
        
        for(int i=0; i<lost.length; i++){            
            if(list.contains(lost[i]-1)){       //앞 번호 학생에게 여벌이 있으면 대체
                index = list.indexOf(lost[i]-1);
                list.remove(index);
                answer++;
            }
            else if(list.contains(lost[i]+1)){  // 뒷 번호 학생에게 여벌이 있으면 대체
                index = list.indexOf(lost[i]+1);
                list.remove(index);
                answer++;
            }
        }
        
        return answer;
    }
}