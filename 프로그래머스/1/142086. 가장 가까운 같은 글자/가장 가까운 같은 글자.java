class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        String[] tmp ={};
        String tmp2;

        
        tmp = s.split("");        
        
        for(int i =0; i<tmp.length; i++){
            if(s.indexOf(tmp[i])==i)
                answer[i]=-1;               
            else{
                tmp2 = s.substring(0, i);               
                answer[i]= i - tmp2.lastIndexOf(tmp[i]);
            }           
        }
        
        return answer;
    }
}