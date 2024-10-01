import java.util.*;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        List<String[]> list = new ArrayList<>();
        TreeMap<String, Integer> map = new TreeMap<>();
        int k = 0;
        
        for(int i=0; i<records.length; i++){
            if(!records[i].equals("")){
                String carnum = records[i].substring(6,10);
                for(int j=i+1; j<records.length; j++){
                    if(!records[j].equals("")){
                        if(records[j].contains(carnum)){
                            int intime  = Integer.parseInt(records[i].substring(0,2))*60 + Integer.parseInt(records[i].substring(3,5));
                            int outtime = Integer.parseInt(records[j].substring(0,2))*60 + Integer.parseInt(records[j].substring(3,5));
                            int usetime = outtime - intime;
                            
                            map.put(carnum, map.getOrDefault(carnum, 0) + usetime);
                            records[i] ="";
                            records[j] ="";
                            break;
                        }
                    }
                }
            }            
        }
        
        for(String s: records){
            if(!s.equals("")){
                String carnum = s.substring(6,10);
                int usetime = (60*23+59) - Integer.parseInt(s.substring(0,2))*60 - Integer.parseInt(s.substring(3,5));
                map.put(carnum, map.getOrDefault(carnum, 0) + usetime);
            }
        }

        int[] answer = new int[map.size()];
           
        for(String s : map.keySet()){
            int pay = 0;
            
            if(map.get(s)<=fees[0])
                pay = fees[1];
            else{
                pay = fees[1] + ((map.get(s) - fees[0]) / fees[2]) * fees[3];
            
                if((map.get(s)-fees[0])%fees[2]!=0)
                   pay += fees[3];
            }
            
            answer[k++] = pay;
        }
        
        return answer;
    }
}