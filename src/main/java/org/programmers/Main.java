package org.programmers;

import java.util.*;

// 알고리즘 문제
class Solution {

    public int[] solution(int denum1, int num1, int denum2, int num2) {
        int[] answer = new int[2];

        int denum = denum1 * denum2;
        int num = (num1 * denum2) + (num2 * denum1);

        int gcd = gcd(denum, num);
        answer[0] = denum / gcd;
        answer[1] = num / gcd;

        return answer;
    }

    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}

//Main 클래스에서 Solution클래스 선언해주기
public class Main {

    public static void main(String[] ars) {
        Solution s = new Solution();
        //입력요소를 선언해줘야 출력값이 나옴
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        s.solution(a, b, c ,d);
    }
}