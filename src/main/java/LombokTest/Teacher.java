package LombokTest;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Builder
public class Teacher {
    private Long id;
    private String name;
    private String subject;
    @With
    private String additionalInfo;


}
