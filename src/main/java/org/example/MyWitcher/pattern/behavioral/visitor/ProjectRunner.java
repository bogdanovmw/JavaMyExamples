package org.example.MyWitcher.pattern.behavioral.visitor;

import org.example.MyWitcher.pattern.behavioral.visitor.model.Project;
import org.example.MyWitcher.pattern.behavioral.visitor.model2.Developer;
import org.example.MyWitcher.pattern.behavioral.visitor.model2.JuniorDev;
import org.example.MyWitcher.pattern.behavioral.visitor.model2.SeniorDev;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new Project();

        Developer junior = new JuniorDev();
        Developer senior = new SeniorDev();

        System.out.println("junior action");
        project.beWritten(junior);

        System.out.println("========");
        System.out.println("senior action");
        project.beWritten(senior);
    }
}
