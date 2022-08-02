package org.example.MyWitcher.solid.s.exm2Good.format;

public class ReportFormatter {
    String formattedOutput;

    public ReportFormatter(Object o, FormatType formatType) {
        switch (formatType) {
            case XML:
                formattedOutput = convertObjectToXml(o);
                break;
            case CSV:
                formattedOutput = convertObjectToCSV(o);
                break;
        }
    }

    private String convertObjectToXml(Object o ){
        return "converted to XML " + o.toString();
    }

    private String convertObjectToCSV(Object o ){
        return "converted to CSV " + o.toString();
    }
}
