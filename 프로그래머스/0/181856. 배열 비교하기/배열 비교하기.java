class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int total1 = 0;
        int total2 = 0;
        
        if(arr1.length>arr2.length)
            return 1;
        else if(arr1.length<arr2.length)
            return -1;
        
        
        for(int i : arr1)
            total1+=i;
        
        
        for(int j : arr2)
            total2+=j; 
        
        if(total1>total2)
            return 1;
        else if(total1<total2)
            return -1;
        else
            return 0;
        
    }
}