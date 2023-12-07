import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        Set<Integer> set = new HashSet<>();   //중복을 제거하기 위한 HashSet 선언
        
        for(int i = 0; i<nums.length; i++)
            set.add(nums[i]);  // 중복되지 않는 값만 set에 add
        
        answer = Math.min(set.size(), nums.length/2); //set의 사이즈(동물의 종류수)와 n/2중 작은수를 answer 에 저장
        
        return answer;
    }
}