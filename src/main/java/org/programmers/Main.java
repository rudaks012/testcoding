package org.programmers;

import java.util.*;

// 알고리즘 문제
class Solution {
    public int solution(int num1, int num2) {
        int check = 0;
        if (num1 == num2) {
            check = 1;
        } else {
            check = -1;
        }
        System.out.println("check = " + check);

        return check;
    }
}

//Main 클래스에서 Solution클래스 선언해주기
public class Main {
    public static void main(String[] ars) {
        Solution s = new Solution();
        //입력요소를 선언해줘야 출력값이 나옴
        int a = 2;
        int b = 2;
        s.solution(a, b);
    }
}