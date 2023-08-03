package org.programmers;

import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public long solution(int a, int b) {
        int[] arr = {a, b};
        Arrays.sort(arr);

        return IntStream.rangeClosed(arr[0], arr[1])
                .asLongStream()
                .sum();
    }
}

public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        long solution = s.solution(3, 5);
        System.out.println(solution);
    }
}
