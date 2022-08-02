package org.example.MyWitcher.algorithms.alanogyIfOrSwitch.exm2;

import org.example.MyWitcher.algorithms.alanogyIfOrSwitch.exm2.model.BusinessMailTemplate;
import org.example.MyWitcher.algorithms.alanogyIfOrSwitch.exm2.model.MailTemplate;
import org.example.MyWitcher.algorithms.alanogyIfOrSwitch.exm2.model.PersonalMailTemplate;

import java.util.HashMap;
import java.util.Map;

public class TemplateHandler {
    public Map<Integer, MailTemplate> templates;

    public TemplateHandler(){
        templates = new HashMap<Integer, MailTemplate>();
        templates.put(0, new BusinessMailTemplate());
        templates.put(1, new PersonalMailTemplate());
    }

    public void addTemplate(int templateCode, MailTemplate mailGenerator){
        templates.put(templateCode, mailGenerator);
    }

    public MailTemplate getTemplate(int templateCode){
        return templates.get(templateCode);
    }
}
