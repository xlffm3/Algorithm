package programmers.step5_brute_force;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrimeNumber {
    private static final int ZERO = 0;
    private static final int ONE = 1;

    public static int solution(String numbers) {
        Set<Integer> targetNumbers = new HashSet<>();
        int numberCounts = numbers.length();
        char[] arr = new char[numberCounts];
        List<Integer> usedIndexes = new ArrayList<>();
        for (int i = ONE; i <= numberCounts; i++) {
            calculateCombination(numbers, arr, ZERO, numberCounts, i, targetNumbers, usedIndexes);
            usedIndexes.clear();
        }
        int primeNumberCounts = ZERO;
        for (Integer targetNumber : targetNumbers) {
            if (isPrimeNumber(targetNumber)) {
                primeNumberCounts++;
            }
        }
        return primeNumberCounts;
    }

    private static boolean isPrimeNumber(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(solution("123"));
        System.out.println(solution("17"));
        System.out.println(solution("011"));
        System.out.println(solution("0"));
        System.out.println(solution("1"));
    }

    private static void calculateCombination(String numbers, char[] arr, int index, int n, int r,
                                             Set<Integer> targetNumbers, List<Integer> usedIndexes) {
        if (index == r) {
            setTargetNumbers(arr, r, targetNumbers);
            return;
        }
        for (int i = ZERO; i < n; i++) {
            arr[index] = numbers.charAt(i);
            if (!isDuplicated(usedIndexes, i)) {
                usedIndexes.add(i);
                calculateCombination(numbers, arr, index + ONE, n, r, targetNumbers, usedIndexes);
                usedIndexes.remove(usedIndexes.size() - ONE);
            }
        }
    }

    private static boolean isDuplicated(List<Integer> usedIndexes, int index) {
        return usedIndexes.stream()
                .anyMatch(usedIndex -> usedIndex == index);
    }


    private static void setTargetNumbers(char[] arr, int r, Set<Integer> targetNumbers) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = ZERO; i < r; i++) {
            stringBuilder.append(arr[i]);
        }
        targetNumbers.add(Integer.parseInt(stringBuilder.toString()));
    }
}
