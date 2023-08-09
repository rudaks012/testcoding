package org.programmers;

import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};

        for (int j : arr) {
            if (j % divisor == 0) {
                answer = Arrays.copyOf(answer, answer.length + 1);
                answer[answer.length - 1] = j;
            }
        }
        answer = answer.length == 0 ? new int[]{-1} : answer;

        Arrays.sort(answer);
        return answer;
    }
}

public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] solution = s.solution(new int[]{5, 9, 7, 10}, 5);
        System.out.println(Arrays.toString(solution));
    }
}
