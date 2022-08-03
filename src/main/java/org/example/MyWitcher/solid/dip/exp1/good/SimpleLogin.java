package org.example.MyWitcher.solid.dip.exp1.good;

public class SimpleLogin implements IAuth {
    @Override
    public boolean auth(User user) {
        // logic
        return true;
    }
}
