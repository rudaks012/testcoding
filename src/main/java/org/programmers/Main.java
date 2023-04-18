package org.programmers;


import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {

    public String solution(String cipher, int code) {

        return IntStream.range(0, cipher.length())
                        .filter(i -> i % code == code - 1)
                        .mapToObj(c -> String.valueOf(cipher.charAt(c)))
                        .collect(Collectors.joining());
    }
}

public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        s.solution("dfjardstddetckdaccccdegk", 4);
    }
}