package org.programmers;

class Solution {

    public int solution(int n) {
        int answer = 0;
        answer = (n + 6) / 7;
        return answer;
    }
}

//Main 클래스에서 Solution클래스 선언해주기
public class Main {

    public static void main(String[] ars) {
        Solution s = new Solution();
        //입력요소를 선언해줘야 출력값이 나옴
        int n = 15;
        s.solution(n);
    }
}