package org.programmers;

class Solution {
    public int solution(String s) {
        int answer = 0;
        String minus = "";
        if (s.charAt(0) == '-') {
            minus = "-";
            s = s.substring(1);
        }
        int parseInt = Integer.parseInt(s);
        answer = Integer.parseInt(minus + parseInt);
        return answer;
    }
}

public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        int solution = s.solution("-1234");
        System.out.println(solution);
    }
}
