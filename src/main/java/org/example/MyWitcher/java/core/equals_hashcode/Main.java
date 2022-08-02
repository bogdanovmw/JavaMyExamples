package org.example.MyWitcher.java.core.equals_hashcode;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        User user1 = new User(1, "Max");
        User user2 = new User(1, "Max");
        User user3 = new User(2, "max");

        System.out.println(user1.hashCode() == user2.hashCode());
        System.out.println(user2.hashCode() == user3.hashCode());
        System.out.println(user1.hashCode() == user3.hashCode());

    }

    static class User {
        private int id;
        private String name;

        public User(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            User user = (User) o;
            return id == user.id && Objects.equals(name, user.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, name);
        }
    }
}
