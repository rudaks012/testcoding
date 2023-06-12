package org.programmers;

import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < keymap.length; i++) {
            for (int j = 0; j < keymap[i].length(); j++) {
                char ch = keymap[i].charAt(j);
                map.put(ch, Math.min(j + 1, map.getOrDefault(ch, Integer.MAX_VALUE)));
            }
        }

        int[] result = new int[targets.length];
        Arrays.fill(result, -1);

        for (int i = 0; i < targets.length; i++) {
            int total = 0;
            for (char ch : targets[i].toCharArray()) {
                if (map.containsKey(ch)) {
                    total += map.get(ch);
                } else {
                    total = -1;
                    break;
                }
            }
            result[i] = total;
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