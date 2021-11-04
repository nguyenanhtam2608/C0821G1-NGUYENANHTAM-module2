package case_study.services;

public interface CustomerService extends Service{
    @Override
    void disPlay();

    @Override
    void add();

    @Override
    void edit();

    @Override
    void returnMainMenu();
}
