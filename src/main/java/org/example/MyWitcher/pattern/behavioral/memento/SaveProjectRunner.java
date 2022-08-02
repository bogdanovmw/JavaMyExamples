package org.example.MyWitcher.pattern.behavioral.memento;

public class SaveProjectRunner {
    public static void main(String[] args) {
        Project project = new Project();
        GithubRepo githubRepo = new GithubRepo();

        System.out.println("Create new project");
        project.setVersionAndDate("v 1.0");
        System.out.println(project);
        System.out.println("save");
        githubRepo.setSave(project.save());
        System.out.println("update");
        project.setVersionAndDate("v 2.0");
        System.out.println(project);
        System.out.println("rollback to 1.0");
        project.load(githubRepo.getSave());
        System.out.println(project);
    }
}
