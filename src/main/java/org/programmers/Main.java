package org.programmers;


import static java.lang.Character.*;

import java.util.stream.Collectors;

class Solution {

    public String solution(String my_string) {

        return my_string.chars()
                        .mapToObj(operand -> String.valueOf((char) (Character.isLowerCase(operand) ? Character.toUpperCase(operand): Character.toLowerCase(operand))))
                        .collect(Collectors.joining());
    }
}


public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        s.solution("cccCCC");
    }
}