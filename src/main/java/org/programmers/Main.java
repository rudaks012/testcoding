package org.programmers;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        int[] correctOrder = {1, 2, 3, 1};
        int[] window = new int[4];

        for (int i = 0; i < ingredient.length; i++) {
            window[i % 4] = ingredient[i];
            if (Arrays.equals(window, correctOrder)) {
                answer++;
            }
        }
        return answer;
    }
}





public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        int solution = s.solution(new int[]{2, 1, 1, 2, 3, 1, 2, 3, 1});
        System.out.println(solution);
    }
}
