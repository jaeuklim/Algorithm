class Solution {
    public String solution(String letter) {
        String answer = "";
        String[][] morseArray = {
            {".-", "a"}, {"-...", "b"}, {"-.-.", "c"}, {"-..", "d"}, {".", "e"}, {"..-.", "f"},
            {"--.", "g"}, {"....", "h"}, {"..", "i"}, {".---", "j"}, {"-.-", "k"}, {".-..", "l"},
            {"--", "m"}, {"-.", "n"}, {"---", "o"}, {".--.", "p"}, {"--.-", "q"}, {".-.", "r"},
            {"...", "s"}, {"-", "t"}, {"..-", "u"}, {"...-", "v"}, {".--", "w"}, {"-..-", "x"},
            {"-.--", "y"}, {"--..", "z"}
        };
        String[] tmp = letter.split(" ");
        
        for(String s : tmp){
            for(int i=0; i<morseArray.length; i++){
                if(morseArray[i][0].equals(s)){
                    answer+= morseArray[i][1];
                    break;
                }
                    
            }
        }
        
        return answer;
    }
}