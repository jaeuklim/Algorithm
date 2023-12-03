class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String []baby = {"aya","ye","woo","ma"}; //발음가능 문자열 생성
        
        for(int i=0; i<babbling.length; i++){            
            for(int j=0; j<baby.length; j++){
                if(babbling[i].contains(baby[j])) //발음 가능한 문자열은 공백으로 저장.
                    babbling[i] = babbling[i].replace(baby[j], " ");
            }
            
            babbling[i] = babbling[i].replaceAll(" ",""); //모든 공백제거
                
            if(babbling[i].equals("")) //빈 문자열이면 발음 가능한 단어임.
                answer++;           
        }
    
        return answer;
        
    }
}