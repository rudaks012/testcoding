package org.programmers;

import java.util.Arrays;
import java.util.Collections;

class Solution {

    public int[] solution(long n) {
        int[] answer = {};
        String s = String.valueOf(n);
        String[] split = s.split("");
        Collections.reverse(Arrays.asList(split));

        answer = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            answer[i] = Integer.parseInt(split[i]);
        }


        return answer;
    }
}

public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] solution = s.solution(12345);
        System.out.println(Arrays.toString(solution));
    }
}
