package HW.Exceptions.HW3.src.control;

import HW.Exceptions.HW3.src.model.Model;

public class Version1Control implements Control {
    @Override
    public void execute(String input) {
        new Model();
    }
}
