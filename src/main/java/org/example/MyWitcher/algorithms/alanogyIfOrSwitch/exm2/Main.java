package org.example.MyWitcher.algorithms.alanogyIfOrSwitch.exm2;

public class Main {
    public static void main(String[] args) {
        TemplateHandler templateHandler = new TemplateHandler();
        String b = templateHandler.getTemplate(0).generateTemplate();
        String p = templateHandler.getTemplate(1).generateTemplate();
        System.out.println(b);
        System.out.println(p);
    }
}
