package org.example.MyWitcher.solid.srp.exm2Good.format;

public class EmployeeReportFormatter extends ReportFormatter {

    public EmployeeReportFormatter(Object o, FormatType formatType) {
        super(o, formatType);
    }

    public String getFormattedEmployee() {
        return formattedOutput;
    }
}
