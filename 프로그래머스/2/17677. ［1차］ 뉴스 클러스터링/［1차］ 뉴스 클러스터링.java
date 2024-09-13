import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        int inter = 0;
        int union = 0;
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<String> interlist = new ArrayList<>();
        List<String> unionlist = new ArrayList<>();
        
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();
        
        for(int i=0; i<str1.length()-1; i++){
            // char a = str1.charAt(i);
            // char b = str2.charAt()
            if(Character.isLetter(str1.charAt(i)) && Character.isLetter(str1.charAt(i+1))){
                    list1.add(""+str1.charAt(i)+str1.charAt(i+1));

            }
        }
        
        for(int i=0; i<str2.length()-1; i++){
            if(Character.isLetter(str2.charAt(i)) && Character.isLetter(str2.charAt(i+1))){
                list2.add(""+str2.charAt(i)+str2.charAt(i+1));
                // if(str2.charAt(i+1) >= 'A' && str2.charAt(i+1) <= 'Z'){
                //     list2.add(""+str2.charAt(i)+str2.charAt(i+1));
                // }   
            }
        }
        
        Collections.sort(list1);
        Collections.sort(list2);
        
        List<String> tmplist = new ArrayList<>(list2);
        
        for(String s : list1){
            if(list2.remove(s)){
                interlist.add(s);
            }
            unionlist.add(s);
        }
        
        for(String s : list2){
            unionlist.add(s);
        }
        
        union  += tmplist.size();
            
        // if(inter==0 || union == 0)
        //     return 65536;
        
        if(unionlist.size()==0)
            return 65536;
        else
            answer = (int)(((double)interlist.size()/(double)unionlist.size())*65536);
        
        return answer;
    }
}