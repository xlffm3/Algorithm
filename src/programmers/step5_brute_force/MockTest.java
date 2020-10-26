package programmers.step5_brute_force;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MockTest {
    private static final int ZERO = 0;

    public static int[] solution(int[] answers) {
        List<Person> persons = Arrays.asList(new Person(1, new int[]{1, 2, 3, 4, 5}),
                new Person(2, new int[]{2, 1, 2, 3, 2, 4, 2, 5}),
                new Person(3, new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5}));
        for (int answer : answers) {
            persons.forEach(person -> person.checkProblem(answer));
            persons.forEach(Person::resetAnswerIndex);
        }
        int maxAnswerCounts = persons.stream()
                .mapToInt(person -> person.answerCounts)
                .max()
                .getAsInt();
        Map<Integer, List<Person>> personsByAnswerCounts = persons.stream()
                .collect(Collectors.groupingBy(person -> person.answerCounts));
        return personsByAnswerCounts.get(maxAnswerCounts)
                .stream()
                .mapToInt(person -> person.index)
                .sorted()
                .toArray();
    }

    static class Person {

        private final int index;
        private final int[] pattern;
        private int answerIndex;
        private int answerCounts;

        public Person(int index, int[] pattern) {
            this.index = index;
            this.pattern = pattern;
            this.answerIndex = ZERO;
            this.answerCounts = ZERO;
        }

        public void checkProblem(int answer) {
            if (answer == this.pattern[this.answerIndex]) {
                this.answerCounts++;
            }
            this.answerIndex++;
        }

        public void resetAnswerIndex() {
            if (this.answerIndex == this.pattern.length) {
                this.answerIndex = ZERO;
            }
        }
    }
}
