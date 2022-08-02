package org.example.MyWitcher.java.JSF.model;

import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Dog {
    private long id;
    private String name;
    private String breed;
    private String registry;
}
