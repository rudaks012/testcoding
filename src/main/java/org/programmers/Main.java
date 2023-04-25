package org.programmers;

import java.util.Arrays;
import java.util.Scanner;

class Solution {

    public int solution(int[] box, int n) {
        return Arrays.stream(box)
                     .map(j -> (int) ((double) j / n))
                     .reduce(1, (a, b) -> a * b);
    }
}


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            System.out.println("*".repeat(i));
        }
    }
}