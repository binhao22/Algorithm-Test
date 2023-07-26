class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 2; i <= n; i++) {
            answer += i;
            i++;
        }
        return answer;
    }
}