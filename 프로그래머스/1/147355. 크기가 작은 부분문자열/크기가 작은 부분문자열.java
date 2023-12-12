class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        String tmp;
        
        for(int i = 0; i<=t.length()-p.length(); i++){ //두 문자열의 길이 차이만큼 반복
            tmp = t.substring(i,i+p.length());  //p의 길이만큼 t를 부분씩 잘라 tmp에 저장
            if(Long.parseLong(tmp)<=Long.parseLong(p)) //잘린 부분 문자열과 p의 크기를 비교
                answer++;
        }
        return answer;
    }
}