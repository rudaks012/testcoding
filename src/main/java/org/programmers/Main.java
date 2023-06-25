package org.programmers;

class Solution {
    public String solution(int[] food) {
        String answer = "0";

        for (int i = food.length - 1; i > 0; i--) {
            for (int j = 0; j < food[i] / 2; j++) {
                answer = i + answer + i;
            }
        }

        return answer;
    }
}


public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        String solution = s.solution(new int[]{1, 3, 4, 6});
        System.out.println(solution);
    }
}
