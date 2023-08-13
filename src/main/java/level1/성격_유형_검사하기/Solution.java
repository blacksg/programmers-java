package level1.성격_유형_검사하기;

import java.util.HashMap;

/*
 * [Lv.1] 2022 KAKAO TECH INTERNSHIP - 성격 유형 검사하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/118666?language=java
 */
class Solution {

    public String solution(String[] survey, int[] choices) {
        char[][] typePairs = {
            { 'R', 'T' },
            { 'C', 'F' },
            { 'J', 'M' },
            { 'A', 'N' }
        };

        HashMap<Character, Integer> points = new HashMap<>();
        for (char[] types : typePairs) {
            for (char type : types) {
                points.put(type, 0);
            }
        }

        for (int i = 0; i < survey.length; i++) {
            char type = survey[i].charAt(choices[i] / 4);
            int point = points.get(type) + Math.abs(choices[i] - 4);
            points.put(type, point);
        }

        StringBuilder builder = new StringBuilder();
        for (char[] types : typePairs) {
            builder.append((points.get(types[0]) >= points.get(types[1])) ? types[0] : types[1]);
        }

        return builder.toString();
    }
}
