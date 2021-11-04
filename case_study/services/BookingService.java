package case_study.services;

public interface BookingService extends Service{
    @Override
    void disPlay();

    @Override
    void add();

    @Override
    void edit();

    @Override
    void returnMainMenu();

    void displayListContracts();

    void createNewConstracts();

}
