package org.programmers;

import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            return new int[]{-1};
        }
        int min = Arrays.stream(arr)
                .min()
                .getAsInt();


        return Arrays.stream(arr)
                .filter(i -> i != min)
                .toArray();
    }
}



public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] solution = s.solution(new int[]{4, 3, 2, 1});
        System.out.println(solution);
    }
}
