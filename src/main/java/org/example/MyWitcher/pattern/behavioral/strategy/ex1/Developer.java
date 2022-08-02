package org.example.MyWitcher.pattern.behavioral.strategy.ex1;

import org.example.MyWitcher.pattern.behavioral.strategy.ex1.model.Activity;

public class Developer {
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void executeActivity(){
        activity.justDoIt();
    }
}
