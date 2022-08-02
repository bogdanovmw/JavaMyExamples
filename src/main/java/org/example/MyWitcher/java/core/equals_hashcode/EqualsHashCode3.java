package org.example.MyWitcher.java.core.equals_hashcode;

import java.util.HashSet;
import java.util.Objects;

public class EqualsHashCode3 {
    public static void main(String[] args) {
        test5();
    }

    private static void test5() { //hashCode and hashCode only
        Contact contact1 = new Contact(123, "Vasiliy", "+380681234136");
        Contact contact2 = new Contact(123, "Vasiliy", "+380689876543");

        HashSet<Contact> contacts = new HashSet<>();
        contacts.add(contact1);

        contacts.remove(contact2);
        contacts.add(contact2);

        contacts.forEach(System.out::println);
    }

    static class Contact {
        final int id;
        final String name;
        final String phone;

        private int hash;

        public Contact(int id, String name, String phone) {
            this.id = id;
            this.name = name;
            this.phone = phone;

            hash = id;
            hash = 31 * hash + (name != null ? name.hashCode() : 0);
            hash = 31 * hash + (phone != null ? phone.hashCode() : 0);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            // Наша проверка
            if (hash != o.hashCode()) {
                return false;
            }
            Contact contact = (Contact) o;
            return id == contact.id && hash == contact.hash && Objects.equals(name, contact.name) && Objects.equals(phone, contact.phone);
        }

        // Свой хеш-код
        @Override
        public int hashCode() {
            return hash;
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
