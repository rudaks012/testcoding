package org.programmers;

import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public long[] solution(int x, int n) {

        return IntStream.range(0, n)
                .mapToLong(i -> (long) x * (i + 1))
                .toArray();
    }
}


public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        long[] solution = s.solution(4, 3);
        System.out.println(Arrays.toString(solution));
    }
}