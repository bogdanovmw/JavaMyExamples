package org.example.MyWitcher.pattern.behavioral.visitor.model2;

import org.example.MyWitcher.pattern.behavioral.visitor.model.Database;
import org.example.MyWitcher.pattern.behavioral.visitor.model.ProjectClass;
import org.example.MyWitcher.pattern.behavioral.visitor.model.Test;

public class JuniorDev implements Developer{
    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("JuniorDev projectClass");
    }

    @Override
    public void create(Database database) {
        System.out.println("JuniorDev database");
    }

    @Override
    public void create(Test test) {
        System.out.println("JuniorDev test");
    }
}
