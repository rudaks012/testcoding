package org.programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
   public String[] solution(String[] players, String[] callings) {
       List<String> playerList = new ArrayList<>(List.of(players));
       for (String calling : callings) {
           int index = playerList.indexOf(calling);
           if (index > 0) {
               playerList.remove(index);
               playerList.add(index - 1, calling);
           }
       }
       return playerList.toArray(new String[0]);
    }
}


public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        String[] solution = s.solution(new String[]{"mumu", "soe", "poe", "kai", "mine"}, new String[]{"kai", "kai", "mine", "mine"});
        System.out.println("solution = " + Arrays.toString(solution));
    }
}