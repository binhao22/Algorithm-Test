class Solution {
    public int solution(int order) {
        String str = "" + order;
        str = str.replaceAll("[1245780]", "");
        return str.length();
    }
}