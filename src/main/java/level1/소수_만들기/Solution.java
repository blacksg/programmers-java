package level1.소수_만들기;

import java.util.ArrayList;
import java.util.Stack;

/*
 * [Lv.1] Summer/Winter Coding(~2018) - 소수 만들기
 *
 * [요구사항]
 * - 주어진 정수 배열 `nums`가 매개변수로 주어질 때,
 *   `nums`에 있는 숫자들 중 서로 다른 3개를 골라 더했을 때 소수가 되는 경우의 개수를 리턴해야 한다.
 *
 * [제한사항]
 * - `nums`의 길이는 3 이상 50 이하다.
 * - `nums`의 각 요소는 1 이상 1000 이하며 중복되지 않는다.
 */
class Solution {

    public int solution(int[] nums) {
        int primeCount = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (isPrime(nums[i] + nums[j] + nums[k])) {
                        primeCount++;
                    }
                }
            }
        }
        return primeCount;
    }

    public int solution2(int[] nums) {
        return countPrimes(nums, 3, 0, new Stack<>(), new ArrayList<>()).size();
    }

    private ArrayList<Integer> countPrimes(
        int[] nums,
        int numberToSelect,
        int currentIndex,
        Stack<Integer> selected,
        ArrayList<Integer> primes
    ) {
        if (selected.size() == numberToSelect) {
            int sum = 0;
            for (int n : selected) {
                sum += n;
            }
            if (isPrime(sum)) {
                primes.add(sum);
            }
        } else {
            for (int i = currentIndex; i < nums.length; i++) {
                selected.push(nums[i]);
                primes = countPrimes(nums, numberToSelect, i + 1, selected, primes);
                selected.pop();
            }
        }
        return primes;
    }

    private boolean isPrime(int num) {
        if (num == 2) {
            return true;
        }
        if (num <= 1 || num % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
