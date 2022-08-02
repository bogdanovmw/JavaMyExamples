package org.example.MyWitcher.algorithms.examples.рефакторингIFилиSwitch;

public class ExampleEnum {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        String message = Message.getTemplate(0).getMailTemplate().getMessage();
        String message2 = Message.getTemplate(1).getMailTemplate().getMessage();
        System.out.println(message);
        System.out.println(message2);
    }
}

interface MailTemplate {
    String getMessage();
}

class BusinessMail implements MailTemplate {
    @Override
    public String getMessage() {
        return "BusinessMail";
    }
}

class PersonMain implements MailTemplate {
    @Override
    public String getMessage() {
        return "PersonMain";
    }
}

enum Message {
    BUSINESS(0, BusinessMail.class), PERSON(1, PersonMain.class);

    private int typeCode;
    private Class<? extends MailTemplate> mailTemplate;

    Message(int typeCode, Class<? extends MailTemplate> mailTemplate) {
        this.typeCode = typeCode;
        this.mailTemplate = mailTemplate;
    }

    public static Message getTemplate(int code) {
        for (Message type : Message.values()) {
            if (type.typeCode == code) {
                return type;
            }
        }
        // 1 Пустой объект 2 null 3 исключение - на выбор
        throw new RuntimeException("Some code");
    }

    public MailTemplate getMailTemplate() throws InstantiationException, IllegalAccessException {
        return mailTemplate.newInstance();
    }
}