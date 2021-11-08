package case_study.controllers;


import case_study.models.facility.Facility;
import case_study.models.person.Employee;
import case_study.services.ContactService;
import case_study.services.PromotionService;
import case_study.services.impl.*;
import org.hamcrest.Factory;

import java.util.Scanner;

public class FuramaController {
    public static void displayMainMenu() {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("1. Employee Management\n" +
                    "2. Customer Management\n" +
                    "3. Facility Management\n" +
                    "4. Booking Management\n" +
                    "5. Promotion Management\n" +
                    "6. Exit");

            EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
            CustomerServiceImpl customerService = new CustomerServiceImpl();
            FacilityServiceImpl facilityService = new FacilityServiceImpl();
            BookingServiceImpl bookingService = new BookingServiceImpl();
            ContactServiceImpl contactService = new ContactServiceImpl();
            PromotionServiceImpl promotionService = new PromotionServiceImpl();


            int select;
            do {
                System.out.println("nhập lựa chọn của bạn ");
                select = Integer.parseInt(input.nextLine());
                switch (select) {

                    case 1: {
                        int option = 0;

                        do {
                            try {
                                System.out.println("1 Display list employees\n" +
                                        "2 Add new employee\n" +
                                        "3 Edit employee\n" +
                                        "4 Return main menu");
                                option = Integer.parseInt(input.nextLine());

                                switch (option) {
                                    case 1: {
                                            employeeService.disPlay();
                                            break;
                                    }
                                    case 2: {

                                        employeeService.add();
                                        break;
                                    }
                                    case 3: {
                                        employeeService.edit();
                                        break;
                                    }
                                    case 4: {
                                        employeeService.returnMainMenu();
                                        break;
                                    }
                                }
                            } catch (Exception e) {
                                System.out.println(e);
                            }
                        } while (option <= 0 || option > 4);
                        break;
                    }
                    case 2: {
                        int option = 0;
                        do {

                            System.out.println("1. Display list customers\n" +
                                    "2. Add new customer\n" +
                                    "3. Edit customer\n" +
                                    "4. Return main menu");

                            option = Integer.parseInt(input.nextLine());

                            switch (option) {
                                case 1: {
                                    customerService.disPlay();
                                    break;
                                }
                                case 2: {
                                    customerService.add();
                                    break;
                                }
                                case 3: {
                                    customerService.edit();
                                    break;

                                }
                                case 4: {
                                    customerService.returnMainMenu();
                                    break;
                                }
                            }
                        } while (option <= 0 || option > 4);
                        break;
                    }
                    case 3: {
                        int option = 0;
                        do {

                            System.out.println("1 Display list facility\n" +
                                    "2 Add new facility\n" +
                                    "3 Display list facility maintenance\n" +
                                    "4 Return main menu");
                            option = Integer.parseInt(input.nextLine());
                            switch (option) {
                                case 1: {
                                    facilityService.disPlay();
                                    break;
                                }
                                case 2: {
                                    facilityService.add();
                                    break;
                                }
                                case 3: {
                                    facilityService.displayListFacilityMaintenance();
                                    break;
                                }
                                case 4: {
                                    facilityService.returnMainMenu();
                                    break;
                                }
                            }

                        } while (option <= 0 || option > 4);
                        break;
                    }
                    case 4: {
                        int option = 0;
                        do {
                            System.out.println("1. Add new booking\n" +
                                    "2. Display list booking\n" +
                                    "3. Create new constracts\n" +
                                    "4. Display list contracts\n" +
                                    "5. Edit contracts\n" +
                                    "6. Return main menu");
                            option = Integer.parseInt(input.nextLine());
                            switch (option) {
                                case 1: {
                                    bookingService.add();
                                    break;
                                }
                                case 2: {
                                    bookingService.disPlay();
                                    break;
                                }
                                case 3: {
                                    ContactServiceImpl.addContract();
                                    break;
                                }
                                case 4: {

                                    ContactServiceImpl.display();
                                    break;
                                }
                                case 5: {
                                    ContactServiceImpl.editContract();
                                    break;
                                }
                                case 6: {
                                    bookingService.returnMainMenu();
                                    break;
                                }
                            }

                        } while (option <= 0 || option > 6);
                        break;
                    }

                    case 5: {

                        int option = 0;
                        do {
                            System.out.println("1. Display list customers use service\n" +
                                    "2. Display list customers get voucher\n" +
                                    "3. Return main menu");
                            option = Integer.parseInt(input.nextLine());
                            switch (option) {
                                case 1: {
                                    promotionService.displayListCustomersUseService();
                                    break;
                                }
                                case 2: {

                                }
                                case 3: {
                                    promotionService.returnMainMenu();
                                    break;

                                }

                            }
                        } while (option <= 0 || option > 3);
                        break;
                    }
                    case 6: {
                        System.out.println("Bạn đã thoát");
                        System.exit(0);
                    }
                }
            } while (select <= 0 || select > 6);
        } catch (Exception e) {
            System.out.println("Nhập sai!!! " + e);
        }
    }
}
