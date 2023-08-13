package level1.개인정보_수집_유효기간;

import java.util.ArrayList;
import java.util.HashMap;

/*
 * [Lv.1] 2023 KAKAO BLIND RECRUITMENT - 개인정보 수집 유효기간
 * https://school.programmers.co.kr/learn/courses/30/lessons/150370?language=java
 */
class Solution {

    public int[] solution(String today, String[] terms, String[] privacies) {
        HashMap<String, Integer> periods = new HashMap<>();
        for (String term : terms) {
            String[] termDetails = term.split(" ");
            periods.put(termDetails[0], Integer.parseInt(termDetails[1]));
        }

        ArrayList<Integer> overduePrivacies = new ArrayList<>(privacies.length);
        int todayCount = countDays(today);
        for (int i = 0; i < privacies.length; i++) {
            String[] privacyDetails = privacies[i].split(" ");
            int expirationCount = countDays(privacyDetails[0]);
            expirationCount += periods.get(privacyDetails[1]) * 28;
            if (todayCount >= expirationCount) {
                overduePrivacies.add(i + 1);
            }
        }

        return overduePrivacies.stream()
            .mapToInt(Integer::intValue)
            .toArray();
    }

    private int countDays(String date) {
        String[] units = date.split("\\.");
        return Integer.parseInt(units[0]) * 12 * 28
               + Integer.parseInt(units[1]) * 28
               + Integer.parseInt(units[2]);
    }
}
