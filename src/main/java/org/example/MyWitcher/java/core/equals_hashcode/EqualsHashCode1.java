package org.example.MyWitcher.java.core.equals_hashcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

public class EqualsHashCode1 {
    public static void main(String[] args) {
//        test1();
//        test2();
        test3();
    }

    private static void test1() {
        Contact contact1 = new Contact(123, "Ivanov", "+79990010101");
        Contact contact2 = new Contact(123, "Ivanov", "+79990010101");

        System.out.println(contact1.hashCode());
        System.out.println(contact2.hashCode());
        System.out.println(contact1.equals(contact2));
    }

    private static void test2() {
        Contact contact1 = new Contact(123, "Vasiliy", "+380681234136");
        Contact contact2 = new Contact(123, "Vasiliy", "+380681234136");

        ArrayList<Contact> contacts = new ArrayList<>();

        contacts.add(contact1);

        System.out.println(contacts.contains(contact2));
        System.out.println(contacts.indexOf(contact2));


        contacts.remove(contact2);
        System.out.println(contacts.size());
        // если в класс есть hashcode то, contact1 удалиться, потому что у contact1 и contact2 одинаковые hashcode
        // если в класс нет hashcode то, то contact1 не удалиться, потому что у contact1 и contact2 будут разные hashcode
    }

    private static void test3() {
        Contact contact1 = new Contact(123, "Vasiliy", "+380681234136");
        Contact contact2 = new Contact(123, "Vasiliy", "+380681234136");

        HashSet<Contact> contacts = new HashSet<>();
        contacts.add(contact1);
        contacts.add(contact2);
        System.out.println(contacts + " : " + contacts.size());

        // Если в класс не будет hashCode и equals, то не будет уникальности
    }

    static class Contact {
        int id;
        String name;
        String phone;

        public Contact(int id, String name, String phone) {
            this.id = id;
            this.name = name;
            this.phone = phone;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Contact contact = (Contact) o;
            return id == contact.id && Objects.equals(name, contact.name) && Objects.equals(phone, contact.phone);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, name, phone);
        }

        @Override
        public String toString() {
            return "Contact{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", phone='" + phone + '\'' +
                    '}';
        }
    }
}
