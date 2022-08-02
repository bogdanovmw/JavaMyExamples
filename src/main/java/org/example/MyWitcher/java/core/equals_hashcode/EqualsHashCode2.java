package org.example.MyWitcher.java.core.equals_hashcode;

import java.util.HashSet;

public class EqualsHashCode2 {
    public static void main(String[] args) {
        test4();
    }

    private static void test4() { //hashCode and hashCode only
        HashSet<Contact> contacts = new HashSet<>();

        Contact contact1 = new Contact(123, "Vasiliy", "+380681234136");
        contacts.add(contact1);

        Contact contact2 = new Contact(123, "Vasiliy", "+380689876543");
        contacts.remove(contact2);
        contacts.add(contact2);

        contacts.forEach(System.out::println);
    }

    static class Contact {
        final int id;
        final String name;
        final String phone;

        public Contact(int id, String name, String phone) {
            this.id = id;
            this.name = name;
            this.phone = phone;
        }

        // Вычислить равенство только по id
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            return o != null && getClass() == o.getClass();
        }

        // Вычислить равенство только по id
        @Override
        public int hashCode() {
            return id;
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
