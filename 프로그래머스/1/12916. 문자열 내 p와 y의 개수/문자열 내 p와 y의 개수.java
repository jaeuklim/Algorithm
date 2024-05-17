class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int num = 0;
        s = s.toUpperCase();
        
        for(char a : s.toCharArray()){
            if(a=='P')
                num++;
            else if(a=='Y')
                num--;
        }
        
        if(num==0)
            return true;
        else
            return false;

    }
}