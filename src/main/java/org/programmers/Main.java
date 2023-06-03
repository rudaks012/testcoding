package org.programmers;
import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> playerMap = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            playerMap.put(players[i], i);
        }
        for (String calling : callings) {
            int index = playerMap.get(calling);
            if (index > 0) {
                String temp = players[index - 1];
                players[index - 1] = calling;
                players[index] = temp;
                playerMap.put(calling, index - 1);
                playerMap.put(temp, index);
            }
        }
        return players;
    }
}



public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        String[] solution = s.solution(new String[]{"mumu", "soe", "poe", "kai", "mine"}, new String[]{"kai", "kai", "mine", "mine"});
        System.out.println("solution = " + Arrays.toString(solution));
    }
}