package org.example.MyWitcher.pattern.behavioral.iterator;

public class DeveloperRunner {
    public static void main(String[] args) {
        String[] skills = {"Java", "Spring", "Hibernate", "Maven", "PostgresSQL"};

        JavaDeveloper developer = new JavaDeveloper("Max", skills);
        Iterator iterator = developer.getIterator();
        System.out.println("Developer: " + developer.getName());
        System.out.println("Skills: ");
        while (iterator.hasNext()){
            System.out.println("\t" + iterator.next().toString());
        }
    }
}
