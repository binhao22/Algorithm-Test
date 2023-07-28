import java.util.*;
class Solution {
    public String solution(String my_string, int num1, int num2) {
        StringBuilder answer = new StringBuilder();
        char[] ch = my_string.toCharArray();
        char tmp = ch[num1];
        ch[num1] = ch[num2];
        ch[num2] = tmp;
        for (char i : ch)
            answer.append(i);
        return answer.toString();
    }
}