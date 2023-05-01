package org.programmers;

import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        String replace = my_string.replaceAll("[^0-9]", "");
        String[] split = replace.split("");
        int[] ints = Arrays.stream(split).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(ints);

        return ints;
    }
}

public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        s.solution("hi12392");
    }
}