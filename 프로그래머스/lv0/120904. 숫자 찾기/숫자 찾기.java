class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String str = "" + num;
        answer = str.indexOf(String.valueOf(k));
        answer = answer == -1 ? answer : answer+1;
        return answer;
    }
}