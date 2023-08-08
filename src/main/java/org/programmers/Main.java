package org.programmers;

import java.util.OptionalInt;
import java.util.stream.IntStream;

class Solution {
    public String solution(String[] seoul) {
        OptionalInt index = IntStream.range(0, seoul.length)
                .filter(i -> seoul[i].equals("Kim"))
                .findFirst();

        return index.isPresent()
                ? "김서방은 " + index.getAsInt() + "에 있다" : "";
    }
}

public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        String solution = s.solution(new String[]{"Jane", "Kim"});
        System.out.println(solution);
    }
}
