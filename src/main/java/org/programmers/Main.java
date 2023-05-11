package org.programmers;

import java.util.OptionalInt;
import java.util.stream.IntStream;

class Solution {
    public OptionalInt solution(int n) {
        return IntStream.rangeClosed(1, n)
                .filter(i -> (i * 6) % n ==0)
                .findFirst();
    }
}

public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        s.solution(6);
    }
}