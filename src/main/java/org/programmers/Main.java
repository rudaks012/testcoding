package org.programmers;

class Solution {
    public int solution(String message) {
        int answer = message.length() * 2;
        return answer;
    }
}

public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        s.solution("bus");
    }
}