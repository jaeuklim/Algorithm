import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i<reserve.length; i++)
            list.add(reserve[i]);
        
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        for(int i=0; i<lost.length; i++){
            if(list.contains(lost[i])){
                answer++;
                list.remove(Integer.valueOf(lost[i]));
                lost[i] = -1;
            }
        }
        
        for(int i=0; i<lost.length; i++){
            if(lost[i] == -1)
                continue;
            
            if(list.contains(lost[i]-1)){
                answer++;
                list.remove(Integer.valueOf(lost[i]-1));
            }
            else if(list.contains(lost[i]+1)){
                answer++;
                list.remove(Integer.valueOf(lost[i]+1));
            }
        }
        
        
        
        // for(int i=0; i<lost.length; i++){
        //     for(int j=0; j<reserve.length; j++){
        //         if(reserve[j] == lost[i]){
        //             System.out.println(reserve[j]);
        //             reserve[j] = -1;
        //             lost[i] = -3;
        //             answer++;
        //             break;
        //         }
        //     }   
        // }
        
//         for(int i=0; i<lost.length; i++){
//             for(int j=0; j<reserve.length; j++){
//                 if(reserve[j] == (lost[i] -1) || reserve[j] == (lost[i]+1)){
//                     // System.out.println(reserve[j]);
//                     reserve[j] = -1;
//                     lost[i] = -3;
//                     answer++;
//                     break;
//                 }
//             }   
//         }
        
        return answer;
    }
}