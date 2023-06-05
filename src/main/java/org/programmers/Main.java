package org.programmers;

import java.util.*;

class Solution {

    public int[] solution(String[] id_list, String[] report, int k) {
        int n = id_list.length;

        Map<String, Set<String>> reportedBy = new HashMap<>();
        Map<String, Integer> reportCount = new HashMap<>();

        for (String r : report) {
            String[] split = r.split(" ");
            String reporter = split[0];
            String reported = split[1];

            if (!reportedBy.containsKey(reporter)) {
                reportedBy.put(reporter, new HashSet<>());
            }

            if (reportedBy.get(reporter).add(reported)) {
                reportCount.put(reported, reportCount.getOrDefault(reported, 0) + 1);
            }
        }

        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            String reporter = id_list[i];
            if (reportedBy.containsKey(reporter)) {
                for (String reported : reportedBy.get(reporter)) {
                    if (reportCount.get(reported) >= k) {
                        answer[i]++;
                    }
                }
            }
        }

        return answer;
    }
}


public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] solution = s.solution(new String[]{"muzi", "frodo", "apeach", "neo"}, new String[]{"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"}, 2);
        System.out.println("solution = " + Arrays.toString(solution));
    }
}