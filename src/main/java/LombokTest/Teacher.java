package LombokTest;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Teacher {
    private Long id;
    private String name;
    private String subject;


}
