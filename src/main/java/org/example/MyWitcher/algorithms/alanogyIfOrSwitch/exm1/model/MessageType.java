package org.example.MyWitcher.algorithms.alanogyIfOrSwitch.exm1.model;

public enum MessageType {
    PERSONAL(0, PersonalMailTemplate.class),
    BUSINESS(1, BusinessMailTemplate.class);

    private int typeCode;
    private Class<? extends MailTemplate> mailTemplate;

    MessageType(int typeCode, Class<? extends MailTemplate> mailTemplate) {
        this.typeCode = typeCode;
        this.mailTemplate = mailTemplate;
    }

    public static MessageType getTemplateByCode(int code) {
        for (MessageType type : MessageType.values()) {
            if (type.typeCode == code) {
                return type;
            }
        }
        throw new RuntimeException("Some message");
    }

    public MailTemplate getPersonalMailTemplate() throws IllegalAccessException, InstantiationException {
        return mailTemplate.newInstance();
    }
}
