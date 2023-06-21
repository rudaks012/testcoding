package org.programmers;

import java.util.stream.IntStream;

class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        for(int i = 1; i <= number; i++) {
            int count = getDivisorCount(i);
            answer += count > limit ? power : count;
        }
        return answer;
    }

    private int getDivisorCount(int n) {
        int count = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                // if divisors are not equal,
                // add both
                if (n / i == i) {
                    count += 1;
                } else {
                    count += 2;
                }
            }
        }
        return count;
    }
}



public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        int solution = s.solution(5, 3, 2);
        System.out.println(solution);
    }
}