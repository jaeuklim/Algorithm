class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String [] poly;
        String tmp;
        int sang=0;
        int sang2=0;
        
        poly = polynomial.split(" "); //공백을 기준으로 문자열 split
        
        for(int i=0; i<poly.length; i++)
        {
            if(poly[i].contains("x")){  // x가 포함되어 있으면 계수 추출
                tmp = poly[i].replaceAll("[^\\d]", "");
                
                if(tmp.isEmpty())  // 계수가 없으면 x로 간주
                    sang += 1;
                else
                    sang += Integer.parseInt(tmp);               
            }
            else if(poly[i].equals("+"))  
                continue;
            else
                sang2 += Integer.parseInt(poly[i]);  //상수항인 경우 sang2에 저장
        }
        
        if(sang != 0 && sang2==0){  // x항만 존재하는경우
            if(sang!=1)
                answer = sang + "x";
            else
                answer = "x";                
        }                
        else if(sang !=0 && sang2!=0){  //x항, 상수항 둘다 존재하는 경우
            if(sang == 1 && sang2 !=0)
                answer = "x + " + sang2;
            else
                answer = sang + "x + " + sang2;
        }            
        else if(sang == 0 && sang2!=0) // 상수항만 존재하는 경우
            answer = Integer.toString(sang2);
        
        return answer;
    }
}