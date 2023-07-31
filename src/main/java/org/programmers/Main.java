package org.programmers;

class Solution {
    boolean solution(String s) {
        s = s.toUpperCase();

        return s.chars().filter(c -> c == 'P').count() == s.chars().filter(c -> c == 'Y').count();
    }

}

public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        boolean solution = s.solution("pPoooyY");
        System.out.println(solution);
    }
}
