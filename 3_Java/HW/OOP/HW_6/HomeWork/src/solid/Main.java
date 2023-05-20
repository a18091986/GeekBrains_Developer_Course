package src.solid;

import solid.utils.Reportable;
import solid.utils.User;
import solid.utils.Report;
import solid.utils.Persister;
import solid.utils.Saveable;



public class Main {
    public static void main(String[] args) {
        User user = new User("Bob");
        Reportable displayReport = new Report();
        displayReport.report(user);
        Saveable displayPersister = new Persister();
        displayPersister.save(user);
    }
}
