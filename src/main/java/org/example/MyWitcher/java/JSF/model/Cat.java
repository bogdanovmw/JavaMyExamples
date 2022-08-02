package org.example.MyWitcher.java.JSF.model;

import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
//implements Comparable<Cat>
public class Cat {
    private long id;
    private String name;
    private String breed;
    private String registry;

//    @Override
//    public int compareTo(Cat o) {
//        return Long.compare(id, o.id);
//    }
}
