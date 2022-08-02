package org.example.MyWitcher.java.JSF;

import com.github.javafaker.Faker;
import org.example.MyWitcher.java.JSF.model.Cat;
import org.example.MyWitcher.java.JSF.model.Dog;

import java.util.*;

public class CollSet {
    private final static Faker FAKER = new Faker();

    public static void main(String[] args) {
//        bigDogs().forEach(System.out::println);
//        bigCats().forEach(System.out::println);
//        getNames().forEach(System.out::println);
//        getCats().forEach(System.out::println);
//        getDogs().forEach(System.out::println);
    }

    // HashSet
    private static HashSet<Dog> bigDogs() {
        HashSet<Dog> dogs = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            dogs.add(new Dog(i, FAKER.gameOfThrones().character(), FAKER.gameOfThrones().city(), FAKER.gameOfThrones().house()));
        }
        return dogs;
    }

    // LinkedHashSet
    private static LinkedHashSet<Dog> bigCats() {
        LinkedHashSet<Dog> dogs = new LinkedHashSet<>();
        for (int i = 0; i < 10; i++) {
            dogs.add(new Dog(i, FAKER.pokemon().name(), FAKER.pokemon().location(), FAKER.color().name()));
        }
        return dogs;
    }

    // TreeSet и without Comparable or Comparator
    private static TreeSet<String> getNames() {
        TreeSet<String> strings = new TreeSet<>();
        for (int i = 0; i < 10; i++) {
            strings.add(i + ", " + FAKER.name().firstName() + " " + FAKER.name().firstName() + " " + FAKER.name().lastName());
        }
        return strings;
    }

    // SortedSet и Comparable
    private static SortedSet<Cat> getCats() {
        SortedSet<Cat> cats = new TreeSet<>();
        for (int i = 0; i < 10; i++) {
            cats.add(new Cat(i, FAKER.cat().name(), FAKER.cat().breed(), FAKER.cat().registry()));
        }
        return cats;
    }

    // NavigableSet и Comparator
    private static NavigableSet<Dog> getDogs() {
        NavigableSet<Dog> dogs = new TreeSet<>((o1, o2) -> Long.compare(o2.getId(), o1.getId()));
        for (int i = 0; i < 10; i++) {
            dogs.add(new Dog(i, FAKER.beer().name(), FAKER.beer().hop(), FAKER.beer().malt()));
        }
        return dogs;
    }
}
