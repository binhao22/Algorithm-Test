class Solution {
   public static String solution(int age) {
        String answer = "";
        String tmp = "" + age;
        char[] ch = tmp.toCharArray();
        for (char i : ch) {
            answer += "" + (char)(i + 'a' - '0');
        }

        return answer;
    }
}