import java.util.*;

class Solution {
    public int solution(int n) {
        
        return ThreejinReverse(n);
    }
    
    public int ThreejinReverse(int num){   
        Stack<Integer> stack = new Stack<Integer>();
        int answer = 0;
        int tmp = 1;
        
        while(num!=0){
            stack.push(num%3);            //3으로 나눈 나머지를 저장하면 앞뒤 반전된 3진법 형태 수가 stack에 저장됨.
            num = num/3;
        }
        
        while(!stack.isEmpty()){
            answer = answer + (tmp*stack.pop()); // 마지막에 push된 숫자부터 pop되므로 자릿수에 맞게 곱해서 더해줌.
            tmp  = tmp * 3; 
        }
        
        return answer;
    }
}