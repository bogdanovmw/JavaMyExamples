package org.example.MyWitcher.java.generics;

import java.util.ArrayList;
import java.util.List;

public class ExamplesWildCards {
    public static void main(String[] args) {

//        List<Dog> dogs = Arrays.asList(new Dog(1, "Dog 1"), new Dog(2, "Dog 2"), new Dog(3, "Dog 3"));
//        List<Cat> cats = Arrays.asList(new Cat(1, "Cat 1"), new Cat(2, "Cat 2"), new Cat(3, "Cat 3"));
//        List<ChildrenDog> childrenDogs = Arrays.asList(
//                new ChildrenDog(1, "Dog 1", "Color 1", 1),
//                new ChildrenDog(2, "Dog 2", "Color 2", 2),
//                new ChildrenDog(3, "Dog 3", "Color 3", 3)
//        );
//        List<ChildrenCat> childrenCats = Arrays.asList(
//                new ChildrenCat(1, "Cat 1", "Color 1", 1),
//                new ChildrenCat(2, "Cat 2", "Color 2", 2),
//                new ChildrenCat(3, "Cat 3", "Color 3", 3)
//        );

        List<Animal> animals = new ArrayList<Animal>() {{
            add(new Animal(1));
            add(new Dog(1, "Dog 1"));
            add(new Cat(1, "Cat 1"));
            add(new ChildrenDog(1, "Dog 1", "Color 1", 1));
            add(new ChildrenCat(1, "Cat 1", "Color 1", 1));
        }};
        setList(animals).forEach(System.out::println);
    }

    static void getList(List<? extends Animal> list) {
        for (Animal animal : list) {
            System.out.println(animal);
        }
    }

    static List<?> setList(List<? super Animal> animals) {
        animals.add(new Animal(2));
        animals.add(new Dog(2, "Dog 2"));
        animals.add(new Cat(2, "Cat 2"));
        animals.add(new ChildrenDog(2, "Dog 2", "Color 2", 2));
        animals.add(new ChildrenCat(2, "Cat 2", "Color 2", 2));
        return animals;
    }
}

class Animal {
    private int id;

    public Animal(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                '}';
    }
}

class Dog extends Animal {
    private String name;

    public Dog(int id, String name) {
        super(id);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "id=" + super.getId() +
                ", name='" + name + '\'' +
                '}';
    }
}
class ChildrenDog extends Dog {
    private String color;
    private int age;

    public ChildrenDog(int id, String name, String color, int age) {
        super(id, name);
        this.color = color;
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "ChildrenDog{" +
                "id=" + super.getId() +
                ", name='" + super.getName() + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}

class Cat extends Animal {
    private String name;

    public Cat(int id, String name) {
        super(id);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "id=" + super.getId() +
                ", name='" + name + '\'' +
                '}';
    }
}
class ChildrenCat extends Cat {
    private String color;
    private int age;

    public ChildrenCat(int id, String name, String color, int age) {
        super(id, name);
        this.color = color;
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "ChildrenCat{" +
                "id=" + super.getId() +
                ", name='" + super.getName() + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
