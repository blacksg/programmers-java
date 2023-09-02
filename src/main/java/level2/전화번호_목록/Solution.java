package level2.전화번호_목록;

import java.util.HashMap;
import java.util.Map;

/*
 * [Lv.2] 해시 - 전화번호 목록
 * https://school.programmers.co.kr/learn/courses/30/lessons/42577
 */
class Solution {

    public boolean solution(String[] phoneBook) {
        Map<String, Integer> hashedPhoneBook = new HashMap<>();
        for (int i = 0; i < phoneBook.length; i++) {
            hashedPhoneBook.put(phoneBook[i], i);
        }
        for (String phoneNumber : phoneBook) {
            for (int j = 0; j < phoneNumber.length(); j++) {
                if (hashedPhoneBook.containsKey(phoneNumber.substring(0, j))) {
                    return false;
                }
            }
        }
        return true;
    }
}
