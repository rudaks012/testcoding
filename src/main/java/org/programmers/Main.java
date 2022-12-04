package org.programmers;

import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public int[] solution(String[] members, String[][] logs) {
        int[] answer = new int[members.length];
        HashMap<String, Boolean> memberInfo = new HashMap<>();
        HashMap<String, Integer> alarmCount = new HashMap<>();

        for (String member : members) {
            memberInfo.put(member, true);
            alarmCount.put(member, 0);
        }

        for (String[] log : logs) {
            String mbrId = log[0];
            String logTy = log[1];

            if (logTy.equals("ALARM")) {
                memberInfo.put(mbrId, false);
            } else if (logTy.equals("ARTICLE")) {
                for (String member : members) {
                    if (member.equals(mbrId)) {
                        continue;
                    }
                    if (memberInfo.get(member)) {
                        alarmCount.put(member, alarmCount.get(member) + 1);
                    }
                }
            }

            for (int i = 0; i < members.length; i++) {
                answer[i] = alarmCount.get(members[i]);
            }
        }
        System.out.println("answer = " + Arrays.toString(answer));
        return answer;
    }
}

//Main 클래스에서 Solution클래스 선언해주기
public class Main {

    public static void main(String[] ars) {
        Solution s = new Solution();
        //입력요소를 선언해줘야 출력값이 나옴
        String[] members = {"A", "B", "C"};
        //logs [[“A”, “ARTICLE”], [“A”, “ALARM”], [“B”, “ARTICLE”], [“C”, “ALARM”], [“B”, “ARTICLE”]]
        String[][] logs = {{"A", "ARTICLE"}, {"A", "ALARM"}, {"B", "ARTICLE"}, {"C", "ALARM"}, {"B", "ARTICLE"}};
        s.solution(members, logs);
    }
}