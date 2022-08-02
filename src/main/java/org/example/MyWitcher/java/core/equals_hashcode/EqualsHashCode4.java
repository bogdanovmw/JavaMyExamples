package org.example.MyWitcher.java.core.equals_hashcode;

import java.util.HashMap;
import java.util.Objects;

public class EqualsHashCode4 {
    public static void main(String[] args) {
        test6();
    }

    private static void test6(){
        Contact contact1 = new Contact(123, "Vasiliy", "+380681234136");

        final HashMap<Contact, String> addressMap = new HashMap<>();
        addressMap.put(contact1, "Ukraine, Odessa, Filatova str. 10 - 25");

        contact1.phone = "+380681234135";

        System.out.println(addressMap.get(contact1));
        addressMap.entrySet().forEach(System.out::println);
        System.out.println(addressMap.get(new Contact(123, "Vasiliy", "+380681234136")));
        /**
         * hashCode ломается из-за того что, первый contact1 был с номером 380681234136, мы его изменили 380681234135 у него стал другой hashCode
         * после добавления старого номера 380681234136 у него меняется hashCode, а предыдущая запись с номером 380681234135 имеет другой hashCode
         * поэтому необходимо быть внимательным
         * */
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
