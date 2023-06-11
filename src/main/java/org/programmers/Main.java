package org.programmers;

import java.util.*;

class Solution {
    public int solution(int n, int m, int[] section) {
        Arrays.sort(section);

        int answer = 0;
        int i = 0;

        while (i < section.length) {
            int start = section[i];
            while (i < section.length && section[i] - start < m) {
                i++;
            }
            answer++;
        }
        return answer;
    }
}


public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        int solution = s.solution(8, 4, new int[]{2, 3, 6});
        System.out.println(solution);
    }
}