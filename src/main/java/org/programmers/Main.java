package org.programmers;

import java.util.Arrays;

class Solution {

    public int[] solution(int n, int[] numlist) {
        int[] answer = {};
        for (int j : numlist) {
            if (j % n == 0) {
                answer = Arrays.copyOf(answer, answer.length + 1);
                answer[answer.length - 1] = j;
            }
        }
        return answer;
    }
}

public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        s.solution(3, new int[]{4, 5, 6, 7, 8, 9, 10, 11, 12});
    }
}