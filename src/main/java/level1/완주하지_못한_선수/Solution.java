package level1.완주하지_못한_선수;

import java.util.*;

/*
 * [Lv.1] 해시 - 완주하지 못한 선수
 *
 * [요구사항]
 * - 마라톤에 참여한 선수들의 이름이 담긴 배열 `participant`와 완주한 선수들의 이름이 담긴 배열 `completion`이 주어질 때,
 *   완주하지 못한 선수의 이름을 리턴해야 한다.
 *
 * [제한사항]
 * - 참여한 선수의 수는 1명 이상 100000명 이하다.
 * - `completion`의 길이는 `participant`의 길이보다 1 작다.
 * - 참가자의 이름은 알파벳 소문자로 이루어져 있으며, 길이는 1 이상 20 이하다.
 * - 동명이인 참가자가 존재할 수 있다.
 */
class Solution {

    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> counts = new HashMap<>();
        for (String name : participant) {
            counts.put(name, counts.getOrDefault(name, 0) + 1);
        }
        for (String name : completion) {
            counts.put(name, counts.get(name) - 1);
        }
        for (String name : participant) {
            if (counts.get(name) > 0) {
                return name;
            }
        }
        return "";
    }
}
