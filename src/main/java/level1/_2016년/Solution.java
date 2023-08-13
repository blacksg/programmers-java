package level1._2016년;

/*
 * 연습문제 - 2016년 (Lv.1)
 *
 * [요구사항]
 * - 주어진 두 정수 `a`, `b`에 대해 2016년 `a`월 `b`일의 요일을 리턴해야 한다.
 *
 * [제한사항]
 * - 2016년 1월 1일은 금요일이다.
 * - 2016년은 윤년이다.
 * - 없는 날짜는 입력으로 주어지지 않는다.
 */
class Solution {

    public String solution(int month, int day) {
        int[] numberOfDays = {
            31, 29, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };
        String[] daysOfWeek = {
            "FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"
        };
        int diff = 0;
        for (int i = 0; i <= month - 2; i++) {
            diff += numberOfDays[i];
        }
        diff += day - 1;
        return daysOfWeek[diff % 7];
    }
}
