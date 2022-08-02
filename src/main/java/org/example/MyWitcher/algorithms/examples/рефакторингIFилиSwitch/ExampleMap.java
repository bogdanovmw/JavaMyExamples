package org.example.MyWitcher.algorithms.examples.рефакторингIFилиSwitch;

import java.util.HashMap;
import java.util.Map;

public class ExampleMap {
    public static void main(String[] args) {
        TemplateHandler template = new TemplateHandler();
        String message = template.getTemplate(0).getMessage();
        String message2 = template.getTemplate(1).getMessage();

        System.out.println(message);
        System.out.println(message2);
    }
}

interface Mail {
    String getMessage();
}

class Business implements Mail {
    @Override
    public String getMessage() {
        return "Business";
    }
}

class Person implements Mail {
    @Override
    public String getMessage() {
        return "Person";
    }
}

class TemplateHandler {
    public Map<Integer, Mail> templates;
    public TemplateHandler() {
        templates = new HashMap<>();
        templates.put(0, new Business());
        templates.put(1, new Person());
    }

    public void add(int code, Mail mail) {
        templates.put(code, mail);
    }

    public Mail getTemplate(int code) {
        return templates.get(code);
    }
}