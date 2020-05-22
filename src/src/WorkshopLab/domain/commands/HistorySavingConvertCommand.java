package src.WorkshopLab.domain.commands;

import src.WorkshopLab.domain.entity.Money;
import src.WorkshopLab.domain.external.ExchangeService;
import src.WorkshopLab.domain.io.Logger;
import src.WorkshopLab.domain.repositoty.ConversionHistoryRepository;

public class HistorySavingConvertCommand extends ConvertCommand {
    private ConversionHistoryRepository repo;

    public HistorySavingConvertCommand(ExchangeService exchangeService,
                                       Logger logger,
                                       ConversionHistoryRepository repo) {
        super(exchangeService, logger);
        this.repo = repo;
    }

    @Override
    public void execute(Input input) {
       Money converted= exchangeAndLog(input);
       repo.save(input.getFrom(),converted);

    }
}
