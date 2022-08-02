package org.example.MyWitcher.pattern.behavioral.command.model;

import org.example.MyWitcher.pattern.behavioral.command.Database;
import org.example.MyWitcher.pattern.behavioral.command.model.Command;

public class SelectCommand implements Command {
    Database database;

    public SelectCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.select();
    }
}
