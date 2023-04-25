package org.programmers;


import java.util.stream.IntStream;

class Solution {

    public int solution(int n, int t) {
        n *= IntStream.range(0, t)
                      .map(i -> 2)
                      .reduce(1, (a, b) -> a * b);
        return n;
    }
}


public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        s.solution(2, 10);
    }
}