class Solution {
    public String solution(String[] str_list, String ex) {
        String answer = "";
        
        for(String tmp : str_list){
            if(tmp.contains(ex))
                continue;
            else
                answer+= tmp;
        }
        return answer;
    }
}