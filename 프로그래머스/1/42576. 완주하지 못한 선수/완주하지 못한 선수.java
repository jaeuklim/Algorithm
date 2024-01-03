import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String,Integer> hash = new HashMap<>();
        
        for(int i=0; i<participant.length; i++)
            hash.put(participant[i], hash.getOrDefault(participant[i], 0) + 1); //해쉬맵에 참가자의 이름을 key로 넣고 해당 key값이 있으면 value에 기존 value값+1을 넣음. 없으면 0 삽입
        
        for(int i=0; i<completion.length; i++)
            hash.put(completion[i], hash.get(completion[i]) - 1); //완주자에 해당하는 키가 있으면 value값에 -1
        
        for (String key : hash.keySet()) {
            if (hash.get(key) != 0) // value값이 0이 아니면 완주하지 못했으므로 해당 key값을 answer에 저장.
                answer = key;
        }        
        
        return answer;
    }
}