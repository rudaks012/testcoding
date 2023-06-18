package org.programmers;

import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        Map<Character, Integer> charToIndexMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (charToIndexMap.containsKey(ch)) {
                answer[i] = i - charToIndexMap.get(ch);
            } else {
                answer[i] = -1;
            }
            charToIndexMap.put(ch, i);
        }

        return answer;
    }
}



public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] solution = s.solution("banana");
        System.out.println(Arrays.toString(solution));
    }
}