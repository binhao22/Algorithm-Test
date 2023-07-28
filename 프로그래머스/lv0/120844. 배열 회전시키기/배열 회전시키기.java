import java.util.*;

class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        int[] left = Arrays.copyOfRange(numbers, 1, numbers.length);
        int[] right = Arrays.copyOfRange(numbers, 0, numbers.length);
        if (direction.equals("right")) {
            for (int i = 0; i < answer.length-1; i++) {
                answer[i + 1] = right[i];
                answer[0] = numbers[numbers.length - 1];
            }
        }
        else {
            for (int i = 0; i < answer.length-1; i++) {
                answer[i] = left[i];
                answer[answer.length-1] = numbers[0];
            }
        }
        return answer;
    }
}