class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        String[] tmp ={};
        String tmp2;
        
        tmp = s.split("");        
        
        for(int i =0; i<tmp.length; i++){
            if(s.indexOf(tmp[i])==i)  //해당 문자열의 첫번째 위치가 탐색한 위치와 같은경우
                answer[i]=-1;               
            else{                     
                tmp2 = s.substring(0, i);    //현재 값 위치를 반환하지 않기 위해 직전까지 문자열 slice.           
                answer[i]= i - tmp2.lastIndexOf(tmp[i]);  //탐색하고자 하는 값의 마지막 등장 인덱스 위치를 찾음
            }           
        }
        
        return answer;
    }
}