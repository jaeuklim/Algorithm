class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String str = Integer.toString(num);
        
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == (char)(k+'0'))
                return i+1;
            else
                System.out.print(str.charAt(i));
        }
        return answer;
    }
}