import java.util.*;

class Solution {
    public static int[] solution(String my_string) {
        char[] chars = my_string.toCharArray();
        Arrays.sort(chars);
        StringBuilder my = new StringBuilder();
        for (char i : chars) {
            my.append(i < 58 ? i : "");
        }
        chars = my.toString().toCharArray();
        int[] answer = new int[my.length()];
        for (int i = 0; i < my.length(); i++) {
            answer[i] = Character.getNumericValue(chars[i]);
        }

        return answer;
    }
}