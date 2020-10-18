package baekjoon.step12_sort;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class AgeSort_10814 {
    private static final int ZERO = 0;
    private static final String SPACE_DELIMITER = " ";

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int peopleCounts = Integer.parseInt(bufferedReader.readLine());
        List<Person> persons = new ArrayList<>();
        for (int i = ZERO; i < peopleCounts; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), SPACE_DELIMITER);
            persons.add(new Person(i, Integer.parseInt(stringTokenizer.nextToken()), stringTokenizer.nextToken()));
        }
        bufferedReader.close();
        Collections.sort(persons);
        for (Person person : persons) {
            bufferedWriter.write(String.format("%d %s\n", person.age, person.name));
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }

    static class Person implements Comparable<Person> {

        private final int registrationOrder;
        private final int age;
        private final String name;

        public Person(int registrationOrder, int age, String name) {
            this.registrationOrder = registrationOrder;
            this.age = age;
            this.name = name;
        }

        @Override
        public int compareTo(Person o) {
            if (name.equals(o.name) && registrationOrder == o.registrationOrder && age == o.age)
                return 0;
            return (age > o.age || (age == o.age && registrationOrder > o.registrationOrder)) ? 1 : -1;
        }
    }
}
