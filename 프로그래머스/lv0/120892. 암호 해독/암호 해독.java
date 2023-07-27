class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        for (int i = 0; (code-1) + i*code < cipher.length(); i++)
            answer += cipher.charAt((code-1) + i*code);
        return answer;
    }
}