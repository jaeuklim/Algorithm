class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        int garo = board[0]/2;
        int sero = board[1]/2;
        
        for(String s: keyinput){
            if(s.equals("up")){
                if(answer[1]<sero)
                    answer[1]++;
            }                
            else if(s.equals("down")){
                if(answer[1]> -sero)
                    answer[1]--;
            }                            
            else if(s.equals("right")){
                if(answer[0]<garo)
                    answer[0]++;
            }                
            else if(s.equals("left")){
                if(answer[0]>(-garo))
                    answer[0]--;
            }                            
        }
        
        return answer;
    }
}