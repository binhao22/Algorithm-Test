class Solution {
    public int solution(int hp) {
        int answer = 0;
        for (int i : new int[] {5, 3, 1}) {
            answer += hp == 0 ? 0 : hp / i;
            hp %= i;
        }
        return answer;
    }
}