package org.example.MyWitcher.pattern.structural.adapter.ex1;

public class DatabaseRunner {
    public static void main(String[] args) {
//        Database database = null;
//        database.insert();
//        database.update();
//        database.select();
//        database.remove();

        Database database2 = new AdapterJavaToDatabase();
        database2.insert();
        database2.update();
        database2.select();
        database2.remove();
    }
}
