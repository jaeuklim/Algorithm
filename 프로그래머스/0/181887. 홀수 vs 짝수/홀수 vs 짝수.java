class Solution {
    public int solution(int[] num_list) {
        int tmp1=0;
        int tmp2=0;
        
        for(int i=0; i<num_list.length; i++){
            if(i%2==0)
                tmp1 += num_list[i];
            else
                tmp2 += num_list[i];
        }
        
        return Math.max(tmp1,tmp2);
    }
}