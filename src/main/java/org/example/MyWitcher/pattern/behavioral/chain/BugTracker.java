package org.example.MyWitcher.pattern.behavioral.chain;

import org.example.MyWitcher.pattern.behavioral.chain.model.EmailNotifier;
import org.example.MyWitcher.pattern.behavioral.chain.model.Notifier;
import org.example.MyWitcher.pattern.behavioral.chain.model.SMSNotifier;
import org.example.MyWitcher.pattern.behavioral.chain.model.SimpleReportNotifier;

public class BugTracker {
    public static void main(String[] args) {
        Notifier reportNotifier = new SimpleReportNotifier(Priority.ROUTINE);
        Notifier emailNotifier = new EmailNotifier(Priority.IMPORTANT);
        Notifier smsNotifier = new SMSNotifier(Priority.ASAP);

        reportNotifier.setNextNotifier(emailNotifier);
        emailNotifier.setNextNotifier(smsNotifier);

        reportNotifier.notifyManager("Все ок!", Priority.ROUTINE);
        reportNotifier.notifyManager("Что то пошло не так!", Priority.IMPORTANT);
        reportNotifier.notifyManager("Все сломалось!", Priority.ASAP);
    }
}
