package LombokTest;


import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Student {

    private Long id;
    private  String name;
    private String address;
    private double grade;
}
