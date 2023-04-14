package org.programmers;

import java.util.stream.IntStream;

class Solution {
    public int solution(String A, String B) {

        String tempB = B.repeat(3);

        return tempB.indexOf(A);
    }
}

public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        s.solution("hello", "ohell");
    }
}