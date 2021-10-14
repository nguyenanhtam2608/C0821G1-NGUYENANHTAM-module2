package on_tap_oop_cuoituan;

import java.util.Scanner;

public class BankAccount {
    private long numberAccount;
    private String nameAccount;
    private double numberMoney;
    private double add;
    private double delet;

    BankAccount() {

    }

    public BankAccount(long numberAccount, String nameAccount) {
        this.numberAccount = numberAccount;
        this.nameAccount = nameAccount;
    }

    public BankAccount(long numberAccount, String nameAccount, double numberMoney) {
        this.numberAccount = numberAccount;
        this.nameAccount = nameAccount;
        this.numberMoney = numberMoney;
    }

    public BankAccount(String nameAccount, double numberMoney, double delet) {
        this.nameAccount = nameAccount;
        this.numberMoney = numberMoney;
        this.delet = delet;
    }

    public BankAccount(double numberMoney) {
        this.numberMoney = numberMoney;
    }

    public BankAccount(double numberMoney, double add) {
        this.numberMoney = numberMoney;
        this.add = add;
    }

    public long getNumberAccount() {
        return numberAccount;
    }

    public void setNumberAccount(long numberAccount) {
        this.numberAccount = numberAccount;
    }

    public String getNameAccount() {
        return nameAccount;
    }

    public void setNameAccount(String nameAccount) {
        this.nameAccount = nameAccount;
    }

    public double getNumberMoney() {
        return numberMoney;
    }

    public void setNumberMoney(double numberMoney) {
        this.numberMoney = numberMoney;
    }

    public double getAdd() {
        return add;
    }

    public void setAdd(double add) {
        this.add = add;
    }

    public double getDelet() {
        return delet;
    }

    public void setDelet(double delet) {
        this.delet = delet;
    }

    double result = 0;

    public double addMoney() {
        result = this.numberMoney + this.add;
        System.out.println("Số tiền sau khi thêm là " + result);
        return result;
    }

    public double deletMoney() {
        result = this.numberMoney - (this.delet + 5);
        System.out.println("Số tiền sau khi rút là " + result);
        return result;
    }

    final double interestRate = 0.0035;

    public double expire() {
        result = this.numberMoney + this.numberMoney * interestRate;
        System.out.println("Tổng số tiền đáo hạng là :" + result);
        return result;
    }


    @Override
    public String toString() {
        return "BankAccount[" +
                "numberAccount=" + numberAccount +
                ", nameAccount='" + nameAccount + '\'' +
                ", numberMoney=" + numberMoney +
                ']';
    }

    public static void main(String[] args) {


        BankAccount bankAccount = new BankAccount(26082002, "Nguyễn Anh Tâm", 50);

        System.out.println("Thông tin tài khoản của bạn ");
        System.out.println(bankAccount);
        System.out.println("1.Thêm tiền vào tài khoản");
        System.out.println("2.Rút tiền ra khỏi tài khoản");
        System.out.println("3.Hiển thị số tiền đáo hạn");
        System.out.println("4.Chuyển khoản");


        Scanner input = new Scanner(System.in);

        int option;
        do {
            System.out.println("\t"+"--Enter opsitom--");
            option = Integer.parseInt(input.nextLine());
            switch (option) {
                case 1: {
                    double add;
                    do {
                        System.out.println("Nhập số tiền muốn thêm ");
                        add = Double.parseDouble(input.nextLine());
                        if (add > 0) {
                            BankAccount addMoney = new BankAccount(50, add);
                            System.out.println(addMoney.addMoney());
                        }

                    } while (add < 0);
                    break;
                }
                case 2: {
                    double delet;
                    do {
                        System.out.println("Nhập số tiền muốn rút ");
                        delet = Double.parseDouble(input.nextLine());
                        if (delet <= (bankAccount.numberMoney - 5) && delet > 0) {
                            BankAccount deletMoney = new BankAccount("Nguyễn Anh Tâm", 50, delet);
                            System.out.println(deletMoney.deletMoney());
                        }

                    } while (delet > (bankAccount.numberMoney - 5) || delet < 5);
                    break;
                }
                case 3: {
                    BankAccount expire = new BankAccount(50);
                    System.out.println(expire.expire());
                    break;
                }
                case 4: {

                    double delet;
                    do {
                        System.out.println("nhập số tiền muốn chuyển ");
                        delet = Double.parseDouble(input.nextLine());
                        if (delet <= (bankAccount.numberMoney - 5) && delet > 0) {
                            BankAccount deletMoney = new BankAccount("Nguyễn Anh Tâm", 50, delet);
                            System.out.println("số tền trước khi chuyển khoản cho tài khoản A : ");
                            System.out.println(deletMoney.numberMoney);
                            System.out.println("số tền sau khi chuyển khoản cho tài khoản A + Phí chuyển khoản  còn : ");
                            System.out.println(deletMoney.deletMoney());
                        }

                    } while (delet > (bankAccount.numberMoney - 5) || delet < 5);

                    BankAccount receiveTransfer = new BankAccount("Nguyễn Anh A", 100, delet);
                    System.out.println("Số tiền của tài khoản A trước khi chuyển ");
                    System.out.println(receiveTransfer.numberMoney);
                    System.out.println("Số tiền của tài khoản A sau khi nhận  ");
                    System.out.println(receiveTransfer.numberMoney + delet);

                }
            }

        } while (option <= 0 || option > 4);
    }
}
