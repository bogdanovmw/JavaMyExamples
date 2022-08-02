package org.example.MyWitcher.pattern.structural.adapter.ex1;

public class AdapterJavaToDatabase extends JavaApplication implements Database{

    @Override
    public void insert() {
        saveObject();
    }

    @Override
    public void update() {
        updateObject();
    }

    @Override
    public void select() {
        selectObject();
    }

    @Override
    public void remove() {
        removeObject();
    }
}
