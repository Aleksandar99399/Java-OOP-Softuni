package src.WorkshopLab.console;

import src.WorkshopLab.domain.io.Logger;

public class ConsoleLogger implements Logger {
    @Override
    public void logLine(String line) {
        System.out.println(line);
    }
}
