import java.util.*;

class Solution {
    public int[] solution(String s) {
        String[] tmp = s.split("[{,}]");
        Map<String, Integer> map = new HashMap<>();
              
        
        for(String str : tmp){
            if(str.matches("\\d+")){
                map.put(str, map.getOrDefault(str,0)+1);
            }                  
        }
        
        int[] answer = new int[map.size()];
        List<Integer> list = new ArrayList<>();
        
        for(int i : map.values())
            list.add(i);         
        
        Collections.sort(list, Collections.reverseOrder());
        
        for (int i = 0; i < answer.length; i++) {
            int freq = list.get(i);
            
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                if (entry.getValue() == freq) {
                    answer[i] = Integer.parseInt(entry.getKey());
                    break;
                }
            }
        }
        
        return answer;
    }
}