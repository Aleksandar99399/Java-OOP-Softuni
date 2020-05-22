package src.WorkshopLab.console;

import src.WorkshopLab.domain.commands.*;
import src.WorkshopLab.domain.entity.Money;
import src.WorkshopLab.domain.external.ExchangeService;
import src.WorkshopLab.domain.io.Logger;
import src.WorkshopLab.domain.repositoty.ConversionHistoryRepository;

import java.math.BigDecimal;

public class ConsoleCommandExecutor{

    private ConversionHistoryRepository conversionHistoryRepository;
    private Logger  logger;
    private ExchangeService exchangeService;

    public ConsoleCommandExecutor(
            ConversionHistoryRepository conversionHistoryRepository,
            Logger logger,
            ExchangeService exchangeService) {
        this.conversionHistoryRepository = conversionHistoryRepository;
        this.logger = logger;
        this.exchangeService = exchangeService;
    }

    public void execute(String[]args){
        switch (args[0]){
            case "END":
                end();
                break;
            case "CONVERT":
                convert(args);
                break;
            case "HISTORY":
                history(args);
                break;
            default:
                logger.logLine("Incorrect command");
                break;

        } 
    }
    private void history(String[] split) {
        Command<HistoryCommand.Input>cmd=new HistoryCommand(conversionHistoryRepository,logger);
        cmd.execute(new HistoryCommand.Input(Integer.parseInt(split[1])));
    }

    private void convert(String[] split) {
        BigDecimal fromValue= new BigDecimal(split[1]);
        String fromCurrency=split[2];
        String toCurrency=split[3];

        ConvertCommand.Input input=new ConvertCommand.Input(
                new Money(fromValue,fromCurrency),toCurrency
        );

        new HistorySavingConvertCommand(
                exchangeService,
                logger,
                conversionHistoryRepository).execute(input);
    }

    private void end() {
        new EndCommand().execute(new EmptyInput());

    }

}
