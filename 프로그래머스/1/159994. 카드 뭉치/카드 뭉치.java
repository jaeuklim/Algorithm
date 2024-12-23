class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        int idx1 = 0;
        int idx2 = 0;
        
        for(String s : goal){
            if(idx1<cards1.length){
                if(cards1[idx1].equals(s)){
                    idx1++;
                    continue;
                }
            }
            
            if(idx2<cards2.length){
                if(cards2[idx2].equals(s)){
                    idx2++;
                    continue;
                }
            }
            
            answer = "No";
            break;
        }
        
        return answer;
    }
}