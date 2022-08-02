package org.example.MyWitcher.solid.s.exm1.good;

public class DataManagerImpl implements IDataManager {
    @Override
    public void send(String message) {
        System.out.println("Data send successfully: " + message);
    }

    @Override
    public int receive() {
        System.out.println("Data received successfully");
        return 0;
    }
}
