package org.programmers;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int n, int[] x1, int[] y1, int[] x2, int[] y2) {

        List<List<Integer>> listAdjust = IntStream.range(0, n)
                                               .<List<Integer>>mapToObj(i -> new ArrayList<>())
                                               .collect(Collectors.toList());

        IntStream.range(0, n).forEach(i -> {
            IntStream.range(i + 1, n).forEach(j -> {
                if (shareBorder(x1[i], y1[i], x2[i], y2[i], x1[j], y1[j], x2[j], y2[j])) {
                    listAdjust.get(i).add(j);
                    listAdjust.get(j).add(i);
                }
            });
        });

        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            boolean[] visited = new boolean[n];
            answer[i] = dfs(i, listAdjust, visited) ;
        }

        return answer;
    }

    private boolean shareBorder(int x1a, int y1a, int x2a, int y2a, int x1b, int y1b, int x2b, int y2b) {
        return isShareBorder(x1a, y1a, x2a, y2a, x1b, y1b, x2b, y2b);
    }

    private boolean isShareBorder(int x1a, int y1a, int x2a, int y2a, int x1b, int y1b, int x2b,
        int y2b) {
        return (x1a == x2b || x2a == x1b || y1a == y2b || y2a == y1b) &&
            (Math.max(x1a, x1b) < Math.min(x2a, x2b) || Math.max(y1a, y1b) < Math.min(y2a, y2b));
    }

    private int dfs(int node, List<List<Integer>> adjList, boolean[] visited) {
        if (visited[node]) {
            return 0;
        }
        visited[node] = true;

        int count = 1;

        count += adjList.get(node)
                        .stream()
                        .mapToInt(neighbor -> neighbor)
                        .map(neighbor -> dfs(neighbor, adjList, visited))
                        .sum();

        return count;
    }
}

public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] answer = s.solution(4, new int[]{10, 30, 65, 10}, new int[]{15, 40, 40, 70}, new int[]{40, 65, 80, 30}, new int[]{40, 60, 70, 90});
        System.out.println(Arrays.toString(answer));
    }
}