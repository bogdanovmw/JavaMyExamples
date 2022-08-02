package org.example.MyWitcher.pattern.behavioral.visitor.model2;

import org.example.MyWitcher.pattern.behavioral.visitor.model.Database;
import org.example.MyWitcher.pattern.behavioral.visitor.model.ProjectClass;
import org.example.MyWitcher.pattern.behavioral.visitor.model.Test;

public interface Developer {
    void create(ProjectClass projectClass);
    void create(Database database);
    void create(Test test);
}
