class Solution {
    int answer = 0;
    public int solution(int[] numbers, int target) {             
        DFS(numbers, target, 0, 0);
        
        return answer;
    }
    
    public void DFS(int[] numbers, int target, int idx, int num){        
        if(idx==numbers.length){
            if(num==target)
                answer++;
            
            return;
        }
        
        DFS(numbers, target, idx+1, num-numbers[idx]);
        DFS(numbers, target, idx+1, num+numbers[idx]);
    }
}