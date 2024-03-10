import java.util.*;

class Solution {
    public int[] solution(String myString) {
        List<String> list = new ArrayList<>();
        String []tmp = myString.split("x");
        
        for(int i = 0; i<tmp.length; i++)
            list.add(tmp[i]);
        
        if(myString.charAt(myString.length()-1)=='x')
            list.add("");
        
        int[] answer = new int[list.size()];
        
        for(int i=0; i<list.size(); i++){
            answer[i]= list.get(i).length();
            System.out.println(list.get(i));
        }
        
        return answer;
    }
}