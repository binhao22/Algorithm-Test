import java.util.*;
import java.util.stream.Stream;

class Solution {
    public static String solution(String myString) {
        String answer = "";
        char[] str = myString.toCharArray();
        for (int i = 0; i < myString.length(); i++)
            answer += "" + Character.toUpperCase(str[i]);
        return answer;
    }
}