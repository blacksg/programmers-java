package level2;

import java.util.*;

/*
 * [Lv.2] 해시 - 의상
 * https://school.programmers.co.kr/learn/courses/30/lessons/42578?language=java
 */
class ClotheCombination {

    public int solution(String[][] clothes) {
        Map<String, List<String>> categorizedClothes = new HashMap<>();
        for (String[] clothe : clothes) {
            if (!categorizedClothes.containsKey(clothe[1])) {
                categorizedClothes.put(clothe[1], new ArrayList<>());
            }
            categorizedClothes.get(clothe[1]).add(clothe[0]);
        }
        int combination = 1;
        for (Map.Entry<String, List<String>> category : categorizedClothes.entrySet()) {
            combination *= category.getValue().size() + 1;
        }
        return combination - 1;
    }
}
