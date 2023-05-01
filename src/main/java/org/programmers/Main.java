package org.programmers;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Solution {

    public String solution(String my_string, int num1, int num2) {
        List<String> list = Arrays.stream(my_string.split("")).collect(Collectors.toList());
        Collections.swap(list, num1, num2);
        return String.join("", list);
    }
}

public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        s.solution("hello", 1, 2);
    }
}