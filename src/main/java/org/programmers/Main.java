package org.programmers;

import java.util.ArrayDeque;
import java.util.Deque;

class Solution {

    public int solution(int[] ingredient) {
        int[] stack = new int[ingredient.length];
        int sp = 0;
        int answer = 0;
        for (int i : ingredient) {
            stack[sp++] = i;
            if (sp >= 4 && stack[sp - 1] == 1 && stack[sp - 2] == 3 && stack[sp - 3] == 2 && stack[sp - 4] == 1) {
                sp -= 4;
                answer++;
            }
        }
        return answer;
    }


    private boolean canMakeBurger(Deque<Integer> stack) {
        if (stack.size() < 4) {
            return false;
        }

        Integer fourth = stack.pollLast();
        Integer third = stack.pollLast();
        Integer second = stack.pollLast();
        Integer first = stack.pollLast();

        stack.addLast(first);
        stack.addLast(second);
        stack.addLast(third);
        stack.addLast(fourth);

        return first == 1 && second == 2 && third == 3 && fourth == 1; // modified
    }

    private void makeBurger(Deque<Integer> stack) {
        stack.pollLast();
        stack.pollLast();
        stack.pollLast();
        stack.pollLast();
    }
}


public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        int solution = s.solution(new int[]{2, 1, 1, 2, 3, 1, 2, 3, 1});
        System.out.println(solution);
    }
}
