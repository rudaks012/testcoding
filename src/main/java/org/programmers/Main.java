package org.programmers;

import java.util.Arrays;

class Solution {

    public int solution(int price) {

        int answer = 0;
       if (price >= 500000) {
           answer = (int) (price * 0.8);
       } else if (price >= 300000) {
           answer = (int) (price * 0.9);
       } else if (price >= 100000) {
           answer = (int) (price * 0.95);
       } else {
           answer = price;
       }
        System.out.println("answer = " + answer);
        return answer;
    }
}

public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        s.solution(150000);
    }
}