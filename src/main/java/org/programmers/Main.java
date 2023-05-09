package org.programmers;

import java.util.stream.Collectors;

class Solution {
    public String solution(int age) {

        return  String.valueOf(age)
                .chars()
                .mapToObj(i ->String.valueOf((char) (49 + i)))
                .collect(Collectors.joining());
    }
}

public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        s.solution(23);
    }
}