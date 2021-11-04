package case_study.services;

public interface EmployeeService extends Service{
    @Override
    void disPlay();

    @Override
    void add();

    @Override
    void edit();

    @Override
    void returnMainMenu();
}
