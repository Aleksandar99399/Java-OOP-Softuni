package src.WorkshopLab.domain.commands;

import src.WorkshopLab.domain.io.Logger;
import src.WorkshopLab.domain.repositoty.ConversionHistoryRepository;

import java.util.List;

public class HistoryCommand implements Command<HistoryCommand.Input> {

    private final ConversionHistoryRepository repo;
    private Logger logger;

    public HistoryCommand(ConversionHistoryRepository repo,
                          Logger logger){

        this.repo = repo;
        this.logger = logger;
    }
    @Override
    public void execute(Input input) {
        List<String>lastNConversions=this.repo.getLast(input.getNumberToShow());
        for (String nConversion : lastNConversions) {
            logger.logLine(nConversion);
        }

    }

    public static class Input extends EmptyInput{
        private final int numberToShow;

        public Input(int commandsToShow) {
            if (commandsToShow<1){
                throw new IllegalArgumentException("input be a positive integer!");
            }
            this.numberToShow = commandsToShow;
        }

        public int getNumberToShow() {
            return numberToShow;
        }
    }
}
