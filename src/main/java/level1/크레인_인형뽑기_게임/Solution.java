package level1.크레인_인형뽑기_게임;

import java.util.Stack;

/*
 * [Lv.1] 2019 카카오 개발자 겨울 인턴십 - 크레인 인형뽑기 게임
 *
 * [요구사항]
 * - n x n 크기의 화면의 아래쪽부터 쌓여 있는 인형을 뽑는 게임이 있다.
 *   크레인은 멈춰 있는 위치에서 가장 위에 있는 인형을 뽑을 수 있으며 뽑은 인형은 바구니의 아래쪽부터 쌓인다.
 *   인형이 집어지지 않는 경우는 없으나 인형이 없는 위치에서는 크레인을 작동시켜도 아무 일도 일어나지 않는다.
 *   바구니에 같은 모양의 인형이 연속해서 쌓이면 두 인형은 터져 사라진다.
 * - 게임 화면의 상태를 나타내는 2차원 배열 `board`와 크레인을 작동시킨 위치가 담긴 1차원 배열 `moves`가 주어질 때,
 *   크레인을 모두 작동시킨 후 터트려져 사라진 인형의 개수를 리턴해야 한다.
 *
 * [제한사항]
 * - `board`의 크기는 5 x 5 이상 30 x 30 이하다.
 * - `board`의 각 칸은 0 이상 100 이하의 정수로 채워져 있다.
 *   - 0은 빈 칸, 나머지는 인형의 종류를 나타낸다.
 * - `moves`의 크기는 1 이상 1000 이하다.
 * - `moves`의 각 요소는 1 이상이고 `board`의 가로 크기 이하인 자연수다.
 */
class Solution {

    public int solution(int[][] board, int[] moves) {
        int result = 0;
        Stack<Integer> basket = new Stack<>();
        int[] plushRows = new int[board.length];
        for (int column = 0; column < board.length; column++) {
            while (board[plushRows[column]][column] == 0) {
                plushRows[column]++;
            }
        }
        for (int move : moves) {
            int column = move - 1;
            int row = plushRows[column];
            if (row == board.length) {
                continue;
            }
            int plush = board[row][column];
            board[row][column] = 0;
            plushRows[column]++;
            if (!basket.isEmpty() && basket.peek() == plush) {
                basket.pop();
                result += 2;
            } else {
                basket.push(plush);
            }
        }
        return result;
    }
}
