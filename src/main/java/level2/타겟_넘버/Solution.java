package level2.타겟_넘버;

/*
 * [Lv.2] DFS/BFS - 타겟 넘버
 * https://school.programmers.co.kr/learn/courses/30/lessons/43165
 */
class Solution {

    public int solution(int[] numbers, int target) {
        return dfs(numbers, target, 0, 0);
    }

    private int dfs(int[] numbers, int target, int index, int sum) {
        if (index >= numbers.length) {
            return sum == target ? 1 : 0;
        }
        return dfs(numbers, target, index + 1, sum + numbers[index])
               + dfs(numbers, target, index + 1, sum - numbers[index]);
    }
}
