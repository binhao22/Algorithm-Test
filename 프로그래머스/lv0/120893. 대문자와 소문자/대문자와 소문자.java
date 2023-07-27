class Solution {
    public String solution(String my_string) {
        String answer = "";
        for (char i : my_string.toCharArray()) {
            answer += i < 'a' ? Character.toLowerCase(i) : Character.toUpperCase(i);
        }
        return answer;
    }
}