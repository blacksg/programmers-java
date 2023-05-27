package level1;

/*
 * 연습문제 - 짝수와 홀수 (Lv.1)
 *
 * [요구사항]
 * - 정수 num이 짝수면 "Even", 홀수명 "Odd"를 리턴한다.
 *
 * [제한사항]
 * - num은 int 범위의 정수다.
 * - 0은 짝수다.
 */
class EvenOrOdd {
    public String solution(int num) {
        return (num % 2 == 0) ? "Even" : "Odd";
    }
}
