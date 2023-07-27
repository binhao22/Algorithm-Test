class Solution {
    public String solution(String rsp) {
        String answer = "";
        for (char i : rsp.toCharArray())
            answer += i == '2' ? '0' : i == '0' ? '5' : '2';
        return answer;
    }
}