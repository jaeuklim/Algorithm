import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        int x=0;
        
        while(x<s.length()){           
            String tmp = "";
            
            for(int i=0; i<s.length(); i++)
                tmp += s.charAt((i+x)%s.length());
            
            for(int i=0; i<tmp.length(); i++){
                if(tmp.charAt(i)=='(' || tmp.charAt(i)=='{' || tmp.charAt(i)=='[')
                    stack.push(tmp.charAt(i));
                else{
                    if(stack.isEmpty()){
                        stack.push('X');
                        break;
                    }
                    
                    if(stack.peek() == '(' && tmp.charAt(i) == ')')
                        stack.pop();
                    else if(stack.peek() == '{' && tmp.charAt(i) == '}')
                        stack.pop();
                    else if(stack.peek() == '[' && tmp.charAt(i) == ']')
                        stack.pop();
                }        
            }
            
            if(stack.isEmpty())
                answer++;
            
            while(!stack.isEmpty())
                stack.pop();
            
            x++;
        }
        
        return answer;
    }
}