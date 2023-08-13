package level2.카펫;

/*
 * [Lv.2] 완전탐색 - 카펫
 * https://school.programmers.co.kr/learn/courses/30/lessons/42842
 */
class Solution {

    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        for (int i = 1; i * i <= yellow; i++) {
            int height = i + 2;
            int width = yellow / i + 2;
            if (yellow % i == 0 && width * height == brown + yellow) {
                answer[0] = width;
                answer[1] = height;
                break;
            }
        }
        return answer;
    }
}
