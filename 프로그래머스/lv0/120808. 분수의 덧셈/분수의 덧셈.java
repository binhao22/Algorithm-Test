import java.util.*;
import static java.lang.Math.max;

class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] tmp = new int[1000000];
        int denom = denom1 * denom2;
        int numer = (numer1*denom2) + (numer2*denom1);

        for (int i = 1,j = 0; i <= max(numer, denom); i++){
            if (numer % i == 0 && denom % i == 0)
                tmp[j++] = i;
        }
        Arrays.sort(tmp);
        int len = tmp.length;
        int R = tmp[len-1];

        int[] answer = {numer / R, denom / R};
        
        return answer;
    }
}