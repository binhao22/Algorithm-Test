import java.util.*;
class Solution {
    public int[] solution(int n) {
        List<Integer> li = new ArrayList<>();
        int[] answer = new int[li.size()];
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) li.add(i);
        }
        answer = li.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}