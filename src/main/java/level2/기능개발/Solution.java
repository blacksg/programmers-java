package level2.기능개발;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/*
 * [Lv.2] 스택/큐 - 기능개발
 * https://school.programmers.co.kr/learn/courses/30/lessons/42586?language=java
 */
class Solution {

    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < progresses.length; i++) {
            queue.offer((int) Math.ceil((100.0 - progresses[i]) / speeds[i]));
        }
        int[] answer = new int[0];
        while (!queue.isEmpty()) {
            int head = queue.poll();
            int count = 1;
            while (!queue.isEmpty() && queue.peek() <= head) {
                queue.poll();
                count++;
            }
            int[] temp = Arrays.copyOf(answer, answer.length + 1);
            temp[temp.length - 1] = count;
            answer = temp;
        }
        return answer;
    }
}
