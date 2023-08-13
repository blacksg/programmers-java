package level1.신고_결과_받기;

import java.util.*;

/*
 * [Lv.1] 2022 KAKAO BLIND RECRUITMENT - 신고 결과 받기
 * https://school.programmers.co.kr/learn/courses/30/lessons/92334?language=java
 */
class Solution {

    public int[] solution(String[] ids, String[] reports, int k) {
        Map<String, List<String>> reportLists = new HashMap<>();
        Map<String, Integer> reportedCounts = new HashMap<>();
        for (String id : ids) {
            reportLists.put(id, new ArrayList<>());
            reportedCounts.put(id, 0);
        }

        String[] distinctReports = Arrays.stream(reports)
            .distinct()
            .toArray(String[]::new);
        for (String report : distinctReports) {
            String[] details = report.split(" ");
            reportLists.get(details[0]).add(details[1]);
            reportedCounts.put(details[1], reportedCounts.get(details[1]) + 1);
        }

        int[] reportResults = new int[ids.length];
        for (int i = 0; i < ids.length; i++) {
            for (String reportedId : reportLists.get(ids[i])) {
                if (reportedCounts.get(reportedId) >= k) {
                    reportResults[i]++;
                }
            }
        }

        return reportResults;
    }
}
