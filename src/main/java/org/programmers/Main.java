package org.programmers;

import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        Deque<Integer> stack = new ArrayDeque<>();

        for(int i = 0; i < ingredient.length; i++) {
            stack.addLast(ingredient[i]);

            while (canMakeBurger(stack)) {
                makeBurger(stack);
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
        int solution = s.solution(new int[]{1, 3, 2, 1, 2, 1, 3, 1, 2});
        System.out.println(solution);
    }
}
