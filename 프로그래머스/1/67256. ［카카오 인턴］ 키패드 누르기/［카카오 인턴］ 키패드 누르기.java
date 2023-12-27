import java.util.*;

class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        List<String> list = new ArrayList<>();
        String L_finger = "*";
        String R_finger = "#";
        int L_move, R_move;
        
        for(int i = 0; i<numbers.length; i++){
            if(numbers[i]==1 || numbers[i]==4 || numbers[i]==7){  //1 4 7인 경우 왼손엄지 이동 및 저장
                list.add("L");
                L_finger = Integer.toString(numbers[i]);
            }
            else if(numbers[i]==3 || numbers[i]==6 || numbers[i]==9){   //3 6 9인 경우 오른손 엄지 이동 및 저장
                list.add("R");
                R_finger = Integer.toString(numbers[i]);
            }
            else{
                L_move = Distance(numbers[i], L_finger);    //왼엄지에서 이동해야하는 거리
                R_move = Distance(numbers[i], R_finger);    //오른엄지에서 이동해야하는 거리 
                if(L_move>R_move){
                    list.add("R");
                    R_finger = Integer.toString(numbers[i]);
                }
                else if(L_move<R_move){
                    list.add("L");
                    L_finger = Integer.toString(numbers[i]);
                }
                else{   //두 엄지의 이동거리가 같은 경우
                    if(hand.equals("right")){   //오른손잡이인 경우
                        list.add("R");
                        R_finger = Integer.toString(numbers[i]);
                    }
                    else{                      //왼손잡이인 경우
                        list.add("L");
                        L_finger = Integer.toString(numbers[i]);
                    }
                }
            }
        }
        
        answer = String.join("", list);  
        return answer;
    }
    
    public int Distance(int number, String finger){
        int[][] position = {        //각 숫자별 키패드 위치에 맞는 좌표값 배열 선언
                    {3, 1}, //0
                    {0, 0}, //1
                    {0, 1}, //2
                    {0, 2}, //3
                    {1, 0}, //4
                    {1, 1}, //5
                    {1, 2}, //6
                    {2, 0}, //7
                    {2, 1}, //8
                    {2, 2}, //9
                    {3, 0}, //*
                    {3, 2}  //#
            };
        int num_finger;
        int result;
        
        if(finger.equals("*"))          //현재 손가락 위치를 정수화시켜 저장
            num_finger = 10;
        else if(finger.equals("#"))
            num_finger = 11;
        else
            num_finger = Integer.parseInt(finger);
        
        int numberX = position[number][0];  // 찾아야하는 숫자의 x좌표
        int numberY = position[number][1];  // 찾아야 하는 숫자의 y좌표
        int fingerX = position[num_finger][0];  //현재 손가락 위치의 x좌표
        int fingerY = position[num_finger][1];  //현재 손가락 위치의 y좌표
        
        result = Math.abs(numberX - fingerX) + Math.abs(numberY - fingerY); //각 x값의 차이, y값의 차이를 더해 거리를 저장
        
        return result;
    }               
}