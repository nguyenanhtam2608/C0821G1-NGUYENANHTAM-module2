package case_study.validate_readwritefile.validate;

import java.util.Scanner;

public class ValidateContract {
    static Scanner input = new Scanner(System.in);

    public static int idContract() {
        int idContract = 0;
        do {
            System.out.println("Nhập idContract");
            idContract = Integer.parseInt(input.nextLine());
        } while (idContract <= 0);
        return idContract;
    }

    public static int idBooking() {
        int idBooking = 0;
        do {
            System.out.println("Nhập idBooking(Contarct)");
            idBooking = Integer.parseInt(input.nextLine());
        } while (idBooking != ValidateBooking.idBooking());
        return idBooking;
    }

    public static double advanceDepositAmount() {
        double advanceDepositAmount = 0;
        do {
            System.out.println("Số tiền cọc");
            advanceDepositAmount = Double.parseDouble(input.nextLine());
        } while (advanceDepositAmount <= 0);
        return advanceDepositAmount;
    }
 public static double totalPaymentAmount() {
        double totalPaymentAmount = 0;
        do {
            System.out.println("Tổng số tiền thanh toán");
            totalPaymentAmount = Double.parseDouble(input.nextLine());
        } while (totalPaymentAmount < advanceDepositAmount());
        return totalPaymentAmount;
    }

    public static int idCustomer() {
        int idCustomer = 0;
        do {
            System.out.println("Id khách hàng");
           idCustomer =Integer.parseInt(input.nextLine());
        } while (idCustomer <= 0);
        return idCustomer;
    }

}
