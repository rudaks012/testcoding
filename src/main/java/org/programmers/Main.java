package org.programmers;

import java.util.stream.IntStream;

class Solution {

    public int solution(int n) {

        return IntStream.rangeClosed(1, n).filter(i -> n % i == 1)
                        .findFirst().getAsInt();
    }
}

public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        s.solution(10);
    }
}