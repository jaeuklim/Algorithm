class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 0;
        
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        
        for(int i=n; i>0; i/=2){
            answer++;
            if(b/2==a/2+1 && b-a==1){        
                break;
            }
            else{
                a = (a+1)/2;
                b = (b+1)/2;
            }
        }

        return answer;
    }
}