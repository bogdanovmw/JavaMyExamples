package org.example.MyWitcher.pattern.behavioral.template.exp1;

public abstract class WebsiteTemplates {
    public void showPage(){
        System.out.println("Header");
        showPageContent();
        System.out.println("Footer");
    }

    public abstract void showPageContent();
}
