package org.programmers;

import java.util.Arrays;

class Solution {

    public static final int AMERICANO = 5500;

    public int[] solution(int money) {
        int count = money / AMERICANO;
        int remainAmount = money - (count * AMERICANO);
        int[] answer = new int[2];
        answer[0] = count;
        answer[1] = remainAmount;
        return answer;
    }
}

public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        s.solution(15000);
    }
}