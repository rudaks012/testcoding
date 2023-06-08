package org.programmers;
import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        Map<String, Set<String>> reportedBy = new HashMap<>();
        Map<String, Integer> reportCount = new HashMap<>();

        Arrays.stream(report).forEach(r -> {
            String[] split = r.split(" ");
            String reporter = split[0];
            String reported = split[1];
            reportedBy.putIfAbsent(reporter, new HashSet<>());
            if (reportedBy.get(reporter).add(reported)) {
                reportCount.put(reported, reportCount.getOrDefault(reported, 0) + 1);
            }
        });

        return Arrays.stream(id_list).mapToInt(reporter -> {
            if (reportedBy.containsKey(reporter)) {
                return (int) reportedBy.get(reporter).stream()
                                       .filter(reported -> reportCount.get(reported) >= k)
                                       .count();
            }
            return 0;
        }).toArray();
    }
}


public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] solution = s.solution(new String[]{"muzi", "frodo", "apeach", "neo"}, new String[]{"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"}, 2);
        System.out.println("solution = " + Arrays.toString(solution));
    }
}