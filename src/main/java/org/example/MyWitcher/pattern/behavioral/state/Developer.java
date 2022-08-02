package org.example.MyWitcher.pattern.behavioral.state;

import org.example.MyWitcher.pattern.behavioral.state.model.*;

public class Developer {
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void changeActivity(){
        if (activity instanceof Sleeping) {
            setActivity(new Training());
        }else if (activity instanceof Training){
            setActivity(new Coding());
        } else if (activity instanceof Coding){
            setActivity(new Reading());
        } else if (activity instanceof Reading){
            setActivity(new Sleeping());
        }
    }

    // Обертка
    public void justDoIt(){
        activity.justDoIt();
    }
}
