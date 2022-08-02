package org.example.MyWitcher.pattern.behavioral.template.exp1;

public class WebsiteRunner {
    public static void main(String[] args) {
        WebsiteTemplates welcomePage = new WelcomePage();
        WebsiteTemplates newsPage = new WelcomePage();

        welcomePage.showPage();
        System.out.println("===============");
        newsPage.showPage();
    }
}
