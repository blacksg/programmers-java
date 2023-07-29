package level1;

/*
 * [Lv.1] 2020 카카오 인턴십 - 키패드 누르기
 *
 * [요구사항]
 * - 스마트폰 전화 키패드는 다음과 같다.
 *   - 1, 2, 3
 *   - 4, 5, 6
 *   - 7, 8, 9
 *   - *, 0, #
 * - 맨 처음 왼손 엄지손가락은 *, 오른손 엄지손가락은 #에 위치해 있다.
 *   다음 규칙에 따라 양손 엄지손가락을 사용해 숫자를 입력하려 한다.
 *   1. 손가락은 상하좌우로만 이동할 수 있으며 키패드 사이 한 칸 간격은 거리 1에 해당한다.
 *   2. 1, 4, 7을 입력할 때는 왼손을 사용한다.
 *   3. 3, 6, 9를 입력할 때는 오른손을 사용한다.
 *   4. 2, 5, 8, 0을 입력할 때는 가까운 손의 엄지손가락을 사용한다.
 *      각 엄지손가락으로부터의 거리가 같다면 오른손잡이는 오른손, 왼손잡이는 왼손을 사용한다.
 * - 숫자가 누를 순서대로 담긴 배열 `numbers`, 왼손잡이인지 오른손잡이인지를 나타내는 문자열 `hand`가 주어질 때
 *   각 숫자를 누른 엄지손가락이 왼손인지 오른손인지를 나타내는 문자열을 리턴해야 한다.
 *
 * [제한사항]
 * - `numbers`의 크기는 1 이상 1000 이하다.
 * - `numbers`의 요소는 0 이상 9 이하의 정수다.
 * - `hand`는 왼손잡이이면 "left", 오른손잡이이면 "right"다.
 * - 리턴되는 문자열은 왼손 엄지손가락을 사용했을 경우 'L', 오른손 엄지손가락을 사용했을 경우 'R'을 이어붙인 형태다.
 */
class PressKeypad {

    public String solution(int[] numbers, String hand) {
        StringBuilder stringBuilder = new StringBuilder();
        int leftPosition = 10;
        int rightPosition = 12;
        for (int number : numbers) {
            if (number == 0) {
                number = 11;
            }
            String finger = switch (number) {
                case 1, 4, 7 -> "L";
                case 3, 6, 9 -> "R";
                default -> decideFinger(leftPosition, rightPosition, number, hand);
            };
            stringBuilder.append(finger);
            if (finger.equals("L")) {
                leftPosition = number;
            } else {
                rightPosition = number;
            }
        }
        return stringBuilder.toString();
    }

    private String decideFinger(int leftPosition, int rightPosition, int number, String hand) {
        int leftDistance = calculateDistance(leftPosition, number);
        int rightDistance = calculateDistance(rightPosition, number);
        if (leftDistance < rightDistance) {
            return "L";
        } else if (rightDistance < leftDistance) {
            return "R";
        } else {
            return hand.equals("left") ? "L" : "R";
        }
    }

    private int calculateDistance(int currentKey, int targetKey) {
        int diff = Math.abs(currentKey - targetKey);
        return diff / 3 + diff % 3;
    }
}
