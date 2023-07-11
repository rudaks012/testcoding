package org.programmers;

import java.util.Arrays;

class Solution {
    public int solution(int[] number) {
        int answer = 0;
        Arrays.sort(number);

        for (int i = 0; i < number.length - 2; i++) {
            int left = i + 1;
            int right = number.length - 1;

            while (left < right) {
                int sum = number[i] + number[left] + number[right];

                if (sum == 0) {
                    answer++;
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int solution = s.solution(new int[]{-2, 3, 0, 2, -5});
        System.out.println(solution);
    }
}
