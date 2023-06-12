package org.programmers;

import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        Map<Character, Integer> map = new HashMap<>();

        IntStream.range(0, keymap.length)
                .forEach(i -> IntStream.range(0, keymap[i].length())
                        .forEach(j -> map.compute(keymap[i].charAt(j),
                                (ch, old) -> old == null || old > j + 1 ? j + 1 : old)));

        return Arrays.stream(targets)
                .mapToInt(target -> target.chars()
                        .map(ch -> map.getOrDefault((char) ch, -1))
                        .filter(value -> value != -1)
                        .sum())
                .toArray();
    }
}


public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] solution = s.solution(new String[]{"ABACD", "BCEFD"}, new String[]{"ABCD", "AABB"});
        System.out.println(Arrays.toString(solution));
    }
}