package solid;

import solid.dip.DisplayReport;
import solid.dip.PrintReport;
import solid.dip.Report;

public class Main {
    public static void main(String[] args) {
        Report report = new Report();
        report.calculate();
        report.output(new PrintReport());
        report.output(new DisplayReport());
    }
}
