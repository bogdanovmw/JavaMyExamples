package org.example.MyWitcher.algorithms.alanogyIfOrSwitch.exm1;

import org.example.MyWitcher.algorithms.alanogyIfOrSwitch.exm1.model.MessageType;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        String template = MessageType.getTemplateByCode(1).getPersonalMailTemplate().getTemplate();
        System.out.println(template);
    }
}
