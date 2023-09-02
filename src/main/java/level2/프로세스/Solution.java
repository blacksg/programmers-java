package level2.프로세스;

import java.util.LinkedList;
import java.util.Queue;

/*
 * [Lv.2] 스택/큐 - 프로세스
 * https://school.programmers.co.kr/learn/courses/30/lessons/42587?language=java
 */
class Solution {

    public int solution(int[] priorities, int location) {
        Queue<Process> queue = new LinkedList<>();
        for (int i = 0; i < priorities.length; i++) {
            queue.offer(new Process(priorities[i], i));
        }
        int order = 1;
        queueLoop:
        while (!queue.isEmpty()) {
            Process head = queue.poll();
            for (Process process : queue) {
                if (process.getPriority() > head.getPriority()) {
                    queue.offer(head);
                    continue queueLoop;
                }
            }
            if (head.getLocation() == location) {
                return order;
            }
            order++;
        }
        return order;
    }

    static final class Process {

        private final int priority;

        private final int location;

        Process(int priority, int location) {
            this.priority = priority;
            this.location = location;
        }

        public int getPriority() {
            return priority;
        }

        public int getLocation() {
            return location;
        }
    }
}
