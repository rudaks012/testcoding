package org.programmers;

import java.util.stream.IntStream;

class Solution {
    public int solution(String A, String B) {

        int n = A.length();
        for (int i = 0; i < n; i++) {
            if (A.equals(B)) { // A와 B가 같으면 현재 이동 횟수 반환
                return i;
            }
            A = A.charAt(n - 1) + A.substring(0, n - 1); // A의 문자를 오른쪽으로 한 칸씩 밀기
        }
        return -1;
    }
}

public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        s.solution("hello", "ohell");
    }
}