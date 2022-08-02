package org.example.MyWitcher.pattern.creational.prototype.ex1;

public class VersionControlRunner {
    public static void main(String[] args) {
        Project master = new Project(1, "Super project", "D:\\games\\WOW CLASSIC");
        System.out.println(master);
        System.out.println(master.hashCode());
        // 1.
        Project masterClone = (Project) master.copy();
        System.out.println(masterClone);
        System.out.println(masterClone.hashCode());
        // 2.
        ProjectFactory factory = new ProjectFactory(master);
        Project masterClone2 = factory.cloneProject();
        System.out.println(masterClone2);
        System.out.println(masterClone2.hashCode());
    }
}
