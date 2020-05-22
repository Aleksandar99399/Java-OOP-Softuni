package src.WorkshopLab.domain.commands;

public interface Command<T extends EmptyInput>{

    void execute(T input);
}
