package org.programmers;

import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;

        Arrays.sort(score);
        int n = score.length;

        for (int i = n - 1; i >= m - 1; i -= m) {
            answer += m * score[i - m + 1];
        }

        return answer;
    }
}


public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int solution = s.solution(3, 4, new int[]{1, 2, 3, 1, 2, 3, 1});
        System.out.println(solution);
    }
}
