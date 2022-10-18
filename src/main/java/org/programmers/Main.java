package org.programmers;

import java.util.*;

// 알고리즘 문제
class Solution {
    public int solution(int age) {
        int answer = 0;
        int Year = 2022;
        answer = Year - age + 1;
        System.out.println("answer = " + answer);

        return answer;
    }
}
//Main 클래스에서 Solution클래스 선언해주기
public class Main {

    public static void main(String[] ars) {
        Solution s = new Solution();
        //입력요소를 선언해줘야 출력값이 나옴
        int a = 40;

        s.solution(a);
    }
}