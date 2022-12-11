package org.programmers;

import java.util.Arrays;

class Solution {
    public int[] solution(int num, int total) {

        int[] answer = new int[num];

        int middleNumber = total / num;
        int subtracNumber = total % num == 0 ? num / 2 : num / 2 - 1;

        int startNumber = middleNumber - subtracNumber;

        for (int i = 0; i < num; i++) {
            answer[i] = startNumber + i;
        }
        System.out.println(Arrays.toString(answer));

        return answer;
    }
}

//Main 클래스에서 Solution클래스 선언해주기
public class Main {

    public static void main(String[] ars) {
        Solution s = new Solution();
        //입력요소를 선언해줘야 출력값이 나옴
        s.solution(3, 12);
    }
}