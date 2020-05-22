package src.SolidLab.di;

import src.SolidLab.di.business.CurrentFormatter;
import src.SolidLab.di.business.EmployeeDataSource;
import src.SolidLab.di.business.EmployeeInfoProvider;
import src.SolidLab.di.data.InMemoryDataSource;
import src.SolidLab.di.ui.ConsoleClient;
import src.SolidLab.di.ui.EmployeeInfoService;
import src.SolidLab.di.ui.Formatter;

public class Main {
    public static void main(String[] args) {

        EmployeeDataSource dataSource=new InMemoryDataSource();
        Formatter formatter=new CurrentFormatter();
        EmployeeInfoService employeeInfoService=new EmployeeInfoProvider(dataSource);
        ConsoleClient consoleClient=new ConsoleClient(employeeInfoService,formatter);
    }
}
