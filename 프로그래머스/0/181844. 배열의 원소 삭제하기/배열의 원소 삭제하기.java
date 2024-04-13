import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        
        for(int num : delete_list)
            list1.add(num);
        
        for(int i=0; i<arr.length; i++){
            if(!list1.contains(arr[i]))
               list2.add(arr[i]);                
        }
        int[] answer = new int[list2.size()];
        
        for(int i=0; i<list2.size(); i++)
            answer[i] = list2.get(i);          
               
        return answer;
    }
}