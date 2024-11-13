class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int size = nums.length;

        for(int i = 0; i<size; i++){
            for(int j = i+1; j<size; j++){
                for(int k = j+1; k<size; k++){
                    int total = nums[i]+nums[j]+nums[k];
                    boolean check = true;
                    
                    for(int l = 2; l<total; l++){
                        if(total%l==0){
                            check = false;
                            break;                            
                        }
                    }
                    
                    if(check)
                        answer++;
                }
            }
        }

        return answer;
    }
}

