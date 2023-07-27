class Solution {
    public int solution(int price) {
        double answer = 0;
        double p = (double)price;
        answer = p >= 500000 ? p - p/5 : p >= 300000 ? p - p/10 : p >= 100000 ? p - p/20 : p;
        return (int) answer;
    }
}