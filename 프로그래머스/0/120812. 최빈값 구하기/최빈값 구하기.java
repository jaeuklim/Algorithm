class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int[] check = new int[1000];
        int maxbin = -1;
        boolean exist = false;
        
        for(int i : array)
            check[i]++;
        
        for(int i=0; i<check.length; i++){
            if(maxbin<check[i]){
                answer = i;
                maxbin = check[i];
                exist = false;
            }else if(check[i]==maxbin)
                exist = true;
        }
        
        if(exist)
            return -1;
        
        return answer;
    }
}