package level2;

import java.util.Arrays;

/*
 * [Lv.2] 정렬 - H-Index
 * https://school.programmers.co.kr/learn/courses/30/lessons/42747?language=java
 */
class HIndex {

    public int solution(int[] citations) {
        Arrays.sort(citations);
        int answer = 0;
        for (int i = 0; i < citations.length; i++) {
            int h = citations.length - i;
            if (citations[i] >= h) {
                answer = h;
                break;
            }
        }
        return answer;
    }
}
