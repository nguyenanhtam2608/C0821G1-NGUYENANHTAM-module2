package case_study.controllers;


import case_study.models.person.Employee;
import case_study.services.impl.CustomerServiceImpl;
import case_study.services.impl.EmployeeServiceImpl;

import java.util.Scanner;

public class FuramaController {
    public static void displayMainMenu() {
        Scanner input = new Scanner(System.in);
        System.out.println("1. Employee Management\n" +
                "2. Customer Management\n" +
                "3. Facility Management\n" +
                "4. Booking Management\n" +
                "5. Promotion Management\n" +
                "6. Exit");
        System.out.println("nhập lựa chọn của bạn ");

        int select;
        select = Integer.parseInt(input.nextLine());
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        CustomerServiceImpl customerService = new CustomerServiceImpl();

        switch (select) {
            case 1: {

                System.out.println("1 Display list employees\n" +
                        "2 Add new employee\n" +
                        "3 Edit employee\n" +
                        "4 Return main menu");
                int option = Integer.parseInt(input.nextLine());
                switch (option) {
                    case 1: {
                        employeeService.disPlay();
                        break;
                    }
                    case 2: {

                        employeeService.add();
                        break;
                    }
                    case 3:{
                        employeeService.edit();
                        break;
                    }
                    case 4:{
                        System.out.println("1. Employee Management\n" +
                                "2. Customer Management\n" +
                                "3. Facility Management\n" +
                                "4. Booking Management\n" +
                                "5. Promotion Management\n" +
                                "6. Exit");
                    }

                }
                break;
            }
            case 2: {
                System.out.println("1. Display list customers\n" +
                        "2. Add new customer\n" +
                        "3. Edit customer\n" +
                        "4. Return main menu");

                int option = Integer.parseInt(input.nextLine());

                switch (option) {
                    case 1: {
                        customerService.disPlay();
                        break;
                    }
                    case 2: {
                        customerService.add();
                        break;
                    }
                    case 3:{
                        customerService.edit();
                        break;

                    }
                    case 4:{
                        System.out.println("1. Employee Management\n" +
                                "2. Customer Management\n" +
                                "3. Facility Management\n" +
                                "4. Booking Management\n" +
                                "5. Promotion Management\n" +
                                "6. Exit");
                    }

                }
                break;
            }
            case 3: {
                System.out.println("1 Display list facility\n" +
                        "2 Add new facility\n" +
                        "3 Display list facility maintenance\n" +
                        "4 Return main menu");
                break;
            }
            case 4: {
                System.out.println("1. Add new booking\n" +
                        "2. Display list booking\n" +
                        "3. Create new constracts\n" +
                        "4. Display list contracts\n" +
                        "5. Edit contracts\n" +
                        "6. Return main menu");
                break;
            }
            case 5: {
                System.out.println("1. Display list customers use service\n" +
                        "2. Display list customers get voucher\n" +
                        "3. Return main menu");
                break;
            }
            case 6: {
                System.exit(0);
            }
        }


    }
}
