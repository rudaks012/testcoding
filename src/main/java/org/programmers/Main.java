package org.programmers;

import java.util.Arrays;

class Solution {
    public int[] solution(int n) {

        int oddCount = (n + 1) / 2;
        int[] answer = new int[oddCount];

        int count = 1;
        for (int i = 0; i < oddCount; i++) {
            answer[i] = count;
            count += 2;
        }


        return answer;
    }
}

public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        s.solution(10);
    }
}