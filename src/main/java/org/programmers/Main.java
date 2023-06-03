package org.programmers;

import java.util.stream.Collectors;

class Solution {
    public String solution(String my_string) {
        return my_string.toLowerCase()
                .chars()
                .sorted()
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());
    }
}


public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        String cc = s.solution("Bcad");
        System.out.println("solution = " + cc);
    }
}