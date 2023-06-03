package org.programmers;

import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public String solution(String my_string) {
        return Arrays.stream(my_string.split(""))
                .distinct()
                .collect(Collectors.joining());
    }
}


public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        String cc = s.solution("people");
        System.out.println("solution = " + cc);
    }
}