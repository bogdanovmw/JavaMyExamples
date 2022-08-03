package org.example.MyWitcher.solid.srp.exm1.good;

public class Phone implements IConnectionManager, IDataManager {
    private IConnectionManager connectionManager;
    private IDataManager dataManager;

    public Phone(IConnectionManager connectionManager, IDataManager dataManager) {
        this.connectionManager = connectionManager;
        this.dataManager = dataManager;
    }

    @Override
    public void call(String phoneNumber) {
        connectionManager.call(phoneNumber);
    }

    @Override
    public void disconnect() {
        connectionManager.disconnect();
    }

    @Override
    public void send(String message) {
        dataManager.send(message);
    }

    @Override
    public int receive() {
        dataManager.receive();
        return 0;
    }
}
