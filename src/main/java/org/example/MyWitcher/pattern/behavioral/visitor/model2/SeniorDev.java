package org.example.MyWitcher.pattern.behavioral.visitor.model2;

import org.example.MyWitcher.pattern.behavioral.visitor.model.Database;
import org.example.MyWitcher.pattern.behavioral.visitor.model.ProjectClass;
import org.example.MyWitcher.pattern.behavioral.visitor.model.Test;

public class SeniorDev implements Developer {
    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("SeniorDev projectClass");
    }

    @Override
    public void create(Database database) {
        System.out.println("SeniorDev projectClass");
    }

    @Override
    public void create(Test test) {
        System.out.println("SeniorDev projectClass");
    }
}
