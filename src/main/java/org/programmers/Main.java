package org.programmers;

class Solution {
    public String solution(int n) {
        StringBuilder answer = new StringBuilder();
        for(int i = 0; i < n; i++) {
            if(i % 2 == 0) {
                answer.append("수");
            } else {
                answer.append("박");
            }
        }
        return answer.toString();
    }
}



public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        String solution = s.solution(3);
        System.out.println(solution);
    }
}
