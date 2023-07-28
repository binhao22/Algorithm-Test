import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Solution {
    public static String solution(String my_string) {
        String answer = "";
        List<String> strlist = Arrays.asList(my_string.split(""));
        strlist = strlist.stream().distinct().collect(Collectors.toList());
        for (int i = 0; i < strlist.size(); i++)
            answer += strlist.get(i);
        return answer;
    }
}