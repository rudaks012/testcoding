package org.programmers;

import java.util.stream.IntStream;

class Solution {
    public int[] solution(int n) {
        int sqrt = (int) Math.sqrt(n);

        return IntStream.rangeClosed(1, sqrt)
                .filter(i -> n % i == 0)
                .flatMap(i -> IntStream.of(i, n / i))
                .distinct()
                .sorted()
                .toArray();
    }
}

public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        s.solution(24);
    }
}