package org.programmers;

import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public String solution(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        new StringBuilder(new String(chars)).reverse().toString();


        return s.chars()
                .mapToObj(c -> (char) c)
                .sorted((a, b) -> b - a)
                .map(String::valueOf)
                .collect(Collectors.joining());
    }
}


public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        String solution = s.solution("Zbcdefg");
        System.out.println(solution);
    }
}
