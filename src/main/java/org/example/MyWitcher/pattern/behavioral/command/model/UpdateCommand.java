package org.example.MyWitcher.pattern.behavioral.command.model;

import org.example.MyWitcher.pattern.behavioral.command.Database;
import org.example.MyWitcher.pattern.behavioral.command.model.Command;

public class UpdateCommand implements Command {
    Database database;

    public UpdateCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.update();
    }
}
