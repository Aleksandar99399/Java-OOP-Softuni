package src.WorkshopLab.console;

import src.WorkshopLab.domain.external.CurrConvExchangeService;
import src.WorkshopLab.domain.external.ExchangeService;
import src.WorkshopLab.domain.io.Logger;
import src.WorkshopLab.domain.repositoty.ConversionHistoryRepository;
import src.WorkshopLab.repository.InMemoryConversionHistoryRepository;

import java.util.Scanner;

public class ConsoleRunner {



    public void run(){

        Scanner scanner=new Scanner(System.in);

        ExchangeService exchangeService=new CurrConvExchangeService();
        Logger logger=new ConsoleLogger();
        ConversionHistoryRepository conversionHistoryRepo=new InMemoryConversionHistoryRepository();

        ConsoleCommandExecutor executor=new ConsoleCommandExecutor(
                conversionHistoryRepo,
                logger,
                exchangeService
        );
        while (true){
            String line=scanner.nextLine();
            String[]split=line.split("\\s+");

            executor.execute(split);

        }
    }


}
