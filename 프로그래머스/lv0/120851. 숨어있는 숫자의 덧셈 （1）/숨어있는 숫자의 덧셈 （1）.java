class Solution {
    public static int solution(String my_string) {
        int answer = 0;
        char[] str = my_string.toCharArray();
        for (char i : str) {
            answer += (int) i < 58 ? (int) i - '0' : 0;
        }
        return answer;
    }
}