package org.example.MyWitcher.pattern.behavioral.command.model;

import org.example.MyWitcher.pattern.behavioral.command.Database;
import org.example.MyWitcher.pattern.behavioral.command.model.Command;

public class InsertCommand implements Command {
    Database database;

    public InsertCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.insert();
    }
}
