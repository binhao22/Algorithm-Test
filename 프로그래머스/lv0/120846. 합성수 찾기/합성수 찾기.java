class Solution {
    public int solution(int n) {
        int answer = 0;
        int cnt = 0;
        String str = "";
        for (int i = 3; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    cnt++;
                }
                if (cnt == 3) {
                    cnt = 0;
                    answer++;
                    break;
                }
            }
        }
        return answer;
    }
}