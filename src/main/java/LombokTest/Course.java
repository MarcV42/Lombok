package LombokTest;

import lombok.*;

import java.util.List;

@Getter
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Course {
    private Long id;
    private String name;
    private Teacher teacher;
    private List<Student> students;

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}

