package org.programmers;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {
    public String solution(int age) {
        String collect = IntStream.iterate(age, n -> n > 0, n -> n / 10)
                .map(n -> n % 10)
                .mapToObj(i -> (char) ('a' + i))
                .map(String::valueOf)
                .collect(Collectors.joining());
        StringBuilder sb = new StringBuilder(collect);


        return sb.reverse().toString();
    }
}

public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        s.solution(23);
    }
}