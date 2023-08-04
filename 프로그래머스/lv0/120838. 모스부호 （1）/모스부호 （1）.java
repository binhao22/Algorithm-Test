import java.util.*;
class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] let = letter.split(" ");
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < 26; i++) {
            map.put(morse[i], "" + (char)('a' + i));
        }
        for (String str : let) {
            answer += map.get(str);
        }
        return answer;
    }
}