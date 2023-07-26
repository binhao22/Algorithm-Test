import java.util.*;

class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        int idx = 0;
        for (String i : strlist) {
            answer[idx++] = i.length();
        }
            return answer;
    }
}