import java.util.*;
class Solution {
    public static int solution(String before, String after) {
        int answer = 0;
        char[] a = after.toCharArray();
        char[] b = before.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        answer = Arrays.toString(a).equals(Arrays.toString(b)) ? 1 : 0;
        return answer;
    }
}