package src.SolidLab.di.business;

import src.SolidLab.di.ui.Formatter;

import java.time.LocalDateTime;

public class CurrentFormatter implements Formatter {

    @Override
    public String format(String employeeInfo) {
        return String.format("[%s] input ",
                LocalDateTime.now());
    }
}
