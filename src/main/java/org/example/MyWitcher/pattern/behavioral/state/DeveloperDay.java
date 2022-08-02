package org.example.MyWitcher.pattern.behavioral.state;

import org.example.MyWitcher.pattern.behavioral.state.model.Activity;
import org.example.MyWitcher.pattern.behavioral.state.model.Sleeping;

public class DeveloperDay {
    public static void main(String[] args) {
        Activity activity = new Sleeping();
        Developer developer = new Developer();

        developer.setActivity(activity);
        for (int i = 0; i < 10; i++) {
            developer.justDoIt();
            developer.changeActivity();
        }
    }
}
