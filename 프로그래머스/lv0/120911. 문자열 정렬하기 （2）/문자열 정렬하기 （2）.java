import java.util.*;


class Solution {
    public String solution(String my_string) {
        String answer = "";
        String tmp = my_string.toLowerCase();
        char[] ch = tmp.toCharArray();
        Arrays.sort(ch);
        for (char c : ch)
            answer += c;
        return answer;
    }
}