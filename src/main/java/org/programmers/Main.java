package org.programmers;

import java.util.stream.IntStream;

class Solution {
    public int solution(int[] numbers) {
        return IntStream.rangeClosed(0, 9)
                .filter(i -> IntStream.of(numbers).noneMatch(j -> j == i))
                .sum();
    }
}


public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int solution = s.solution(new int[]{1, 2, 3, 4, 6, 7, 8, 0});
        System.out.println(solution);
    }
}
