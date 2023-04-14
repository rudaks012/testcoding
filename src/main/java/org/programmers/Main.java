package org.programmers;

import java.util.stream.IntStream;

class Solution {

    public int[] solution(int n) {

        return IntStream.rangeClosed(1, n)
                        .filter(i -> i % 2 == 1)
                        .toArray();
    }
}

public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        s.solution(10);
    }
}