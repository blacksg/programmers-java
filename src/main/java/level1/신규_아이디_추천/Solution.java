package level1.신규_아이디_추천;

/*
 * [Lv.1] 2021 KAKAO BLIND RECRUITMENT - 신규 아이디 추천
 * https://school.programmers.co.kr/learn/courses/30/lessons/72410?language=java
 */
class Solution {

    public String solution(String newId) {
        String id = newId.toLowerCase();
        id = removeInvalidCharacters(id);
        id = removeRepeatedPeriods(id);
        id = removePrefixPeriod(id);
        id = removeSuffixPeriod(id);
        id = replaceEmptyString(id);
        id = trim(id);
        id = extend(id);
        return id;
    }

    private String removeInvalidCharacters(String id) {
        return id.replaceAll("[^a-z0-9-_.]", "");
    }

    private String removeRepeatedPeriods(String id) {
        return id.replaceAll("\\.{2,}", ".");
    }

    private String removePrefixPeriod(String id) {
        if (id.startsWith(".")) {
            return id.substring(1);
        }
        return id;
    }

    private String removeSuffixPeriod(String id) {
        if (id.endsWith(".")) {
            return id.substring(0, id.length() - 1);
        }
        return id;
    }

    private String replaceEmptyString(String id) {
        if (id.isEmpty()) {
            return id + "a";
        }
        return id;
    }

    private String trim(String id) {
        if (id.length() > 15) {
            return removeSuffixPeriod(id.substring(0, 15));
        }
        return id;
    }

    private String extend(String id) {
        StringBuilder builder = new StringBuilder(id);
        char lastCharacter = builder.charAt(builder.length() - 1);
        while (builder.length() < 3) {
            builder.append(lastCharacter);
        }
        return builder.toString();
    }
}
