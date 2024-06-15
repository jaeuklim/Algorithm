class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String s;
        String[] tmp;
        
        while(i<=j){
            s = Integer.toString(i);
            tmp = s.split("");
            
            for(String ss : tmp)
                if(ss.equals(Integer.toString(k)))
                    answer++;
            
            i++;
        }
        
        return answer;
    }
}