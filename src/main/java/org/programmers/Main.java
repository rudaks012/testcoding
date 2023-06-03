package org.programmers;

import java.util.stream.IntStream;

class Solution {
    public int solution(int n) {
        return (int) IntStream.rangeClosed(4, n)
                .filter(i -> IntStream.rangeClosed(2, (int) Math.sqrt(i)).anyMatch(x -> i % x == 0))
                .count();
    }
}


public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        int cc = s.solution(10);
        System.out.println("solution = " + cc);
    }
}