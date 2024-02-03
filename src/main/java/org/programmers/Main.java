package org.programmers;

import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public int solution(int first, int second) {

        Scanner sc = new Scanner(System.in);
        first = sc.nextInt();
        second = sc.nextInt();


        for (int i = 0; i < second; i++) {
            for (int j = 0; j < first; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        return 0;
    }
}


public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        s.solution(5, 3);
    }
}
