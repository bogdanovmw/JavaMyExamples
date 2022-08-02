package org.example.MyWitcher.pattern.behavioral.command.model;

import org.example.MyWitcher.pattern.behavioral.command.Database;

public class DeleteCommand implements Command {
    Database database;

    public DeleteCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.delete();
    }
}
