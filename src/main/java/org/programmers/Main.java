package org.programmers;


import java.util.stream.Collectors;

class Solution {

    public String solution(String rsp) {

        return rsp.chars()
                  .mapToObj(c -> c == '2' ? '0' : (c == '0' ? '5' : '2'))
                  .map(String::valueOf)
                  .collect(Collectors.joining());
    }
}


public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        s.solution("2");
    }
}