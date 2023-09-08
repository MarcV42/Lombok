package LombokTest;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Main {


        public static void main(String[] args) {
            // Erstelle Studenten mit dem Builder
            Student student1 = Student.builder()
                    .id(1L)
                    .name("Alice")
                    .address("123 Main St")
                    .grade(95.5)
                    .build();

            Student student2 = Student.builder()
                    .id(2L)
                    .name("Bob")
                    .address("456 Elm St")
                    .grade(88.0)
                    .build();

            // Erstelle Lehrer mit dem Builder
            Teacher teacher = Teacher.builder()
                    .id(101L)
                    .name("Mr. Smith")
                    .subject("Math")
                    .build();

            // Erstelle Kurs mit Studenten und Lehrer mit dem Builder
            List<Student> students = new ArrayList<>();
            students.add(student1);
            students.add(student2);

            Course course = Course.builder()
                    .id(1001L)
                    .name("Math 101")
                    .teacher(teacher)
                    .students(students)
                    .build();

            // Teste die generierten Lombok-Methoden
            System.out.println("Kursname: " + course.getName());
            System.out.println("Lehrer: " + course.getTeacher());
            System.out.println("Studenten: " + course.getStudents());
        }
    }


   /* public static void main(String[] args) {
        // Erstelle Studenten
        Student student1 = new Student(1L, "Alice", "123 Main St", 95.5);
        Student student2 = new Student(2L, "Bob", "456 Elm St", 88.0);

        // Erstelle Lehrer
        Teacher teacher = new Teacher(101L, "Mr. Smith", "Math");

        // Erstelle Kurs mit Studenten und Lehrer
        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        Course course = new Course(1001L, "Math 101", teacher, students);

        // Teste generierte Lombok-Methoden
        System.out.println("Kursname: " + course.getName());
        System.out.println("Lehrer: " + course.getTeacher());
        System.out.println("Studenten: " + course.getStudents());
    }


}*/

