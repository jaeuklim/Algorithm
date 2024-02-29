class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        
        if(my_string.contains(is_prefix)){
            if(my_string.substring(0,is_prefix.length()).equals(is_prefix))
                return 1;
            else
                return 0;
        }
        else
            return 0;

    }
}