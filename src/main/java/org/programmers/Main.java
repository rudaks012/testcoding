package org.programmers;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {

        Map<String, Integer> scores = IntStream.range(0, name.length)
                .boxed()
                .collect(Collectors.toMap(i -> name[i], i -> yearning[i]));

        return Arrays.stream(photo)
                .mapToInt(persons -> Arrays.stream(persons)
                        .filter(scores::containsKey)
                        .mapToInt(scores::get)
                        .sum())
                .toArray();

//        Map<String, Integer> scores = new HashMap<>();
//        for (int i = 0; i < name.length; i++) {
//            scores.put(name[i], yearning[i]);
//        }
//
//        int[] answer = new int[photo.length];
//        for (int i = 0; i < photo.length; i++) {
//            int sum = 0;
//            for (String person : photo[i]) {
//                if (scores.containsKey(person)) {
//                    sum += scores.get(person);
//                }
//            }
//            answer[i] = sum;
//        }
//        return answer;
    }
}


public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] solution = s.solution(new String[]{"may", "kein", "kain", "radi"}, new int[]{5, 10, 1, 3}, new String[][]{{"may", "kein", "kain", "radi"}, {"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}});
        for (int i : solution) {
            System.out.println(i);
        }
    }
}