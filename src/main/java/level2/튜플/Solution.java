package level2.튜플;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;

/*
 * [Lv.2] 2019 카카오 개발자 겨울 인턴십 - 튜플
 * https://school.programmers.co.kr/learn/courses/30/lessons/64065?language=java
 */
class Solution {

    public int[] solution(String s) {
        String[] strings = s.substring(0, s.length() - 2)
            .substring(2)
            .split("},\\{");

        int[][] arrays = new int[strings.length][];
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = Arrays.stream(strings[i].split(","))
                .mapToInt(Integer::parseInt)
                .toArray();
        }

        Arrays.sort(arrays, Comparator.comparingInt(arr -> arr.length));

        Set<Integer> set = new LinkedHashSet<>();
        for (int[] array : arrays) {
            for (int element : array) {
                set.add(element);
            }
        }

        return set.stream()
            .mapToInt(Integer::intValue)
            .toArray();
    }
}
