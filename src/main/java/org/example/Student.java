import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student {
    private final String name;
    private final String group;
    private int course; // курс изменяется при переводе
    private final List<Integer> grades; // оценки по предметам (упрощённо: просто список)

    public Student(String name, String group, int course, List<Integer> grades) {
        this.name = Objects.requireNonNull(name);
        this.group = Objects.requireNonNull(group);
        this.course = course;
        this.grades = new ArrayList<>(Objects.requireNonNull(grades));
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public int getCourse() {
        return course;
    }

    public List<Integer> getGrades() {
        return new ArrayList<>(grades);
    }

    public double getAverageGrade() {
        if (grades.isEmpty()) return 0.0;
        int sum = 0;
        for (int g : grades) sum += g;
        return (double) sum / grades.size();
    }

    /** Переводит на следующий курс, если средний балл >= 3 */
    public void promoteIfEligible() {
        if (getAverageGrade() >= 3.0) {
            course++;
        }
    }

    @Override
    public String toString() {
        return String.format("Student{name='%s', group='%s', course=%d, avg=%.2f}",
                name, group, course, getAverageGrade());
    }

    /**
     * Для корректной работы в Set важно определить equals/hashCode.
     * Здесь считаем, что уникальность студента определяется (name, group).
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return name.equals(student.name) && group.equals(student.group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, group);
    }
}