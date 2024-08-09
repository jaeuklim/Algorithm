class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = my_string;
        
        for(int i=0; i<queries.length; i++){
            String tmp = answer;
            answer = tmp.substring(0,queries[i][0]);
            for(int j=queries[i][1]; j>=queries[i][0]; j--){
                answer += tmp.charAt(j);
            }
            answer += tmp.substring(queries[i][1]+1, tmp.length());
            
        }
        
        return answer;
    }
}