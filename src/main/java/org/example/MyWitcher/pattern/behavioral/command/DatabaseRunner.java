package org.example.MyWitcher.pattern.behavioral.command;

import org.example.MyWitcher.pattern.behavioral.command.model.DeleteCommand;
import org.example.MyWitcher.pattern.behavioral.command.model.InsertCommand;
import org.example.MyWitcher.pattern.behavioral.command.model.SelectCommand;
import org.example.MyWitcher.pattern.behavioral.command.model.UpdateCommand;

public class DatabaseRunner {
    public static void main(String[] args) {
        Database database = new Database();
        Developer developer = new Developer(
                new InsertCommand(database),
                new UpdateCommand(database),
                new SelectCommand(database),
                new DeleteCommand(database)
        );

        developer.insertRecord();
        developer.updateRecord();
        developer.selectRecord();
        developer.deleteRecord();
    }
}
