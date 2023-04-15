package org.programmers;

import java.util.Set;
import java.util.stream.Collectors;

class Solution {

    public String solution(String my_string) {
        String answer = "";
        answer = my_string.replaceAll("[aejou]", "");
        return answer;


    }
}

public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        s.solution("bus");
    }
}