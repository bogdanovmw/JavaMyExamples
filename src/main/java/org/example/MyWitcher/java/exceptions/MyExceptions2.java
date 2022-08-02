package org.example.MyWitcher.java.exceptions;

import lombok.Data;
import lombok.EqualsAndHashCode;

public class MyExceptions2 {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        try {
            Student student = studentManager.find("001");
            System.out.println(student);
        } catch (StudentNotFountExceptions e) {
            System.err.println(e);
        }
    }
}

@Data
@EqualsAndHashCode
class Student {
    private String id;
}

class StudentManager {
    public Student find(String id) throws StudentNotFountExceptions {
        if (id.equals("1")) {
            return new Student();
        } else {
            throw new StudentNotFountExceptions("Student not found, id = " + id);
        }
    }
}

class StudentNotFountExceptions extends Exception {
    public StudentNotFountExceptions(String message) {
        super(message);
    }
}