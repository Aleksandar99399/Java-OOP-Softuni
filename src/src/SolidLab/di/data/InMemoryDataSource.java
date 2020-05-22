package src.SolidLab.di.data;

import src.SolidLab.di.business.Employee;
import src.SolidLab.di.business.EmployeeDataSource;

import java.util.Map;

public class InMemoryDataSource implements EmployeeDataSource {

    private static final Map<Long,Employee>STUB_DATA_SOURCE =
            Map.of(
                    1L,new Employee("Alice","Sofia"),
                    2L,new Employee("Bob","Plovdiv"),
                    3L,new Employee("Charlie","Varna")
            );
    @Override
    public Employee getOneById(long id) {

        return STUB_DATA_SOURCE.get(id);
    }
}
