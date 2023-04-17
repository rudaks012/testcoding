package org.programmers;

import java.util.Arrays;

class Solution {

    public int solution(String[] s1, String[] s2) {
        return (int) Arrays.stream(s1)
                           .flatMap(s -> Arrays.stream(s2).filter(s::equals))
                           .count();
    }
}

public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        s.solution(new String[]{"a", "b", "c"}, new String[]{"com", "b", "d", "p", "c"});
    }
}