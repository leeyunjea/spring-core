package hello.core;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class HelloLombok {

    private String name;
    private int age;

    public static void main(String[] args) {
        HelloLombok helloLombok = new HelloLombok();
        helloLombok.setName(":asdf");

        String name1 = helloLombok.getName();
        System.out.println("name1 = " + name1);
        System.out.println("helloLombok = " + helloLombok);
    }
}
