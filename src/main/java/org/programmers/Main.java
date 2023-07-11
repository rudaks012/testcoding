package org.programmers;

import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = -1;
        int sum = 45;

        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            sum -= numbers[i];
        }
        return sum;
    }
}


public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int solution = s.solution(new int[]{1, 2, 3, 4, 6, 7, 8, 0});
        System.out.println(solution);
    }
}
