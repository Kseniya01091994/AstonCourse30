package org.example;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class MainLecture {

    /** Удаляет студентов со средним баллом < 3 */
    public static void removeLowAchievers(Set<Student> students) {
        Iterator<Student> it = students.iterator();
        while (it.hasNext()) {
            Student s = it.next();
            if (s.getAverageGrade() < 3.0) {
                it.remove();
            }
        }
    }

    /** Переводит каждого студента на следующий курс, если средний балл >= 3 */
    public static void promoteEligibleStudents(Set<Student> students) {
        for (Student s : students) {
            s.promoteIfEligible();
        }
    }

    /** Печатает имена студентов, которые учатся на указанном курсе */
    public static void printStudents(Set<Student> students, int course) {
        for (Student s : students) {
            if (s.getCourse() == course) {
                System.out.println(s.getName());
            }
        }
    }

    public static void main(String[] args) {
            Set<Student> students = new HashSet<>();

            students.add(new Student("Алексей", "IT-101", 1, List.of(4, 5, 5, 4)));
            students.add(new Student("Дарья", "IT-101", 1, List.of(2, 3, 2)));      // средний < 3
            students.add(new Student("Сергей", "CS-202", 2, List.of(3, 4, 3, 3)));
            students.add(new Student("Екатерина", "CS-202", 2, List.of(5, 5, 5, 5)));

            System.out.println("Студенты 1 курса:");
            printStudents(students, 1);

            // Удаляем неуспевающих
            removeLowAchievers(students);

            // Переводим тех, кто проходит по среднему баллу
            promoteEligibleStudents(students);

            System.out.println("\nПосле удаления и перевода, студенты 2 курса:");
            printStudents(students, 2);

        System.out.println("\nПосле удаления и перевода, студенты 3 курса:");
        printStudents(students, 3);
    }
}
