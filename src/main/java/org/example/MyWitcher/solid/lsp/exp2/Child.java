package org.example.MyWitcher.solid.lsp.exp2;

public class Child extends Parent {
    @Override
    public void doSmth() {
        throw new RuntimeException();
    }
}
