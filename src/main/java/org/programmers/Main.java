package org.programmers;

import java.util.Arrays;

class Solution {

    public String solution(String my_string, int num1, int num2) {
        char[] my_string_array = my_string.toCharArray();
        char temp = my_string_array[num1];
        my_string_array[num1] = my_string_array[num2];
        my_string_array[num2] = temp;


        return new String(my_string_array);
    }
}

public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        s.solution("hello", 1, 2);
    }
}