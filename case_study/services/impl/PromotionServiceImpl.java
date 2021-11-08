package case_study.services.impl;

import case_study.services.PromotionService;
import case_study.validate_readwritefile.readwritefile.WriteReadFileBooking;
import case_study.validate_readwritefile.readwritefile.WriteReadFilePerson;

public class PromotionServiceImpl implements PromotionService {
    @Override
        public void displayListCustomersUseService() {

        WriteReadFileBooking.readBookingFile(WriteReadFileBooking.BOOKING);
    }

    @Override
    public void displayListCustomersGetVoucher() {

    }

    @Override
    public void returnMainMenu() {
        System.out.println("1. Add new booking\n" +
                "2. Display list booking\n" +
                "3. Create new constracts\n" +
                "4. Display list contracts\n" +
                "5. Edit contracts\n" +
                "6. Return main menu");

    }
}
