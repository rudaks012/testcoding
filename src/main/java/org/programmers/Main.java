package org.programmers;

import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int maxNumber = 0;

        for (int j = 0; j < array.length; j++) {
            if (maxNumber < array[j]) {
                answer[0] = array[j];
                answer[1] = j;
                maxNumber = array[j];
            }
        }

        return answer;
    }
}

public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        s.solution(new int[]{1, 8, 3});
    }
}