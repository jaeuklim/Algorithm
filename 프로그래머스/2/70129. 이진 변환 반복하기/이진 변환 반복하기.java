class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        
        while(true){
            String tmp = "";            
            answer[0]++;
            
            for(char c : s.toCharArray()){
                if(c == '0')
                    answer[1]++;
                else
                    tmp+=c;
            }
            
            s = Integer.toBinaryString(tmp.length());

            if(s.equals("1"))
                break;
        }        
        
        return answer;
    }
}