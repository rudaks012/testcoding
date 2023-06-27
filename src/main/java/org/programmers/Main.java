package org.programmers;

class Solution {
    public String solution(int[] food) {
        String answer = "0";

        int i = food.length - 1;
        while (i > 0) {
            int j = 0;
            while (j < food[i] / 2) {
                answer = i + answer + i;
                j++;
            }
            i--;
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
