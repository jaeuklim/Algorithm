import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        int inter = 0;
        int union = 0;
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();
        
        for(int i=0; i<str1.length()-1; i++){
            if(str1.charAt(i) >= 'A' && str1.charAt(i) <= 'Z'){
                if(str1.charAt(i+1) >= 'A' && str1.charAt(i+1) <= 'Z'){
                    list1.add(""+str1.charAt(i)+str1.charAt(i+1));
                }
            }
        }
        
        for(int i=0; i<str2.length()-1; i++){
            if(str2.charAt(i) >= 'A' && str2.charAt(i) <= 'Z'){
                if(str2.charAt(i+1) >= 'A' && str2.charAt(i+1) <= 'Z'){
                    list2.add(""+str2.charAt(i)+str2.charAt(i+1));
                }   
            }
        }
        
        List<String> tmplist = new ArrayList<>(list2);
        
        for(String s : list1){
            if(tmplist.contains(s)){
                inter++;
                tmplist.remove(s);
            }   
        }
        
        union  = list1.size() + list2.size() - inter;
            
        if(union==0)
            return 65536;
        
        answer = (int)(((double)inter/(double)union)*65536);
        
        return answer;
    }
}