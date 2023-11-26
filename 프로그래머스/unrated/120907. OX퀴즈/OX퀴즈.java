class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        String[] tmp;
        int result;
        
        for(int i = 0; i < quiz.length; i++){
            tmp = quiz[i].split(" ");
            
            if(quiz[i].contains("+")) // + 수식일 경우
                result = Integer.parseInt(tmp[0]) + Integer.parseInt(tmp[2]); 
            else                      // - 수식일 경우        
                result = Integer.parseInt(tmp[0]) - Integer.parseInt(tmp[2]);      
            
            if(result == Integer.parseInt(tmp[4]))   //수식의 결과와 문자열의 결과 비교
                answer[i] = "O";
            else
                answer[i] = "X";
        }
        return answer;
    }
}