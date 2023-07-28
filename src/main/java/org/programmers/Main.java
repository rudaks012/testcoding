package org.programmers;

class Solution {

    public int solution(int n) {

        return String.valueOf(n)
                     .chars()
                     .map(Character::getNumericValue)
                     .sum();
    }
}

public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        int solution = s.solution(12345);
        System.out.println(solution);
    }
}
