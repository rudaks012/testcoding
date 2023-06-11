package org.programmers;

import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        Map<Character, List<Integer>> keyPresses = new HashMap<>();

        for (int i = 0; i < keymap.length; i++) {
            for (int j = 0; j < keymap[i].length(); j++) {
                char c = keymap[i].charAt(j);
                if (!keyPresses.containsKey(c)) {
                    keyPresses.put(c, new ArrayList<>());
                }
                keyPresses.get(c).add(i+1);
            }
        }

        int[] result = new int[targets.length];

        for (int i = 0; i < targets.length; i++) {
            String target = targets[i];
            int lastKeyPress = -1;
            int totalPresses = 0;
            for (char c : target.toCharArray()) {
                if (!keyPresses.containsKey(c)) {
                    totalPresses = -1;
                    break;
                }
                List<Integer> presses = keyPresses.get(c);
                int nextPress = presses.get(0);
                if (nextPress == lastKeyPress && presses.size() > 1) {
                    nextPress = presses.get(1);
                }
                totalPresses += nextPress;
                lastKeyPress = nextPress;
            }
            result[i] = totalPresses;
        }

        return result;
    }
}




public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
       int[] solution = s.solution(new String[] {"ABACD", "BCEFD"}, new String[] {"ABCD","AABB"});
        System.out.println(Arrays.toString(solution));
    }
}