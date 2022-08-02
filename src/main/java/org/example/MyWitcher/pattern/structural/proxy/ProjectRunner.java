package org.example.MyWitcher.pattern.structural.proxy;

public class ProjectRunner {
    public static void main(String[] args) {
//        Project project = new RealProject("https://www.github.com/test/Project");
//        project.run();

        Project project = new ProxyProject("https://www.github.com/test/Project");
        project.run();
    }
}
