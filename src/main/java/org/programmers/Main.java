package org.programmers;

import java.util.Arrays;

class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int[] newNumber = new int[absolutes.length];

        for (int i = 0; i < absolutes.length; i++) {
            if(signs[i] == true) {
                newNumber[i] = absolutes[i];
            } else {
                newNumber[i] = -absolutes[i];
            }
        }
        return Arrays.stream(newNumber).sum();
    }
}


public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] absolutes = {4, 7, 12};
        boolean[] signs = {true, false, true};
        int solution = s.solution(absolutes, signs);
        System.out.println(solution);
    }
}