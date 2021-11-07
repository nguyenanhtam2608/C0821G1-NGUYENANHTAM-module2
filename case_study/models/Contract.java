package case_study.models;

public class Contract {
    private int numberContract;
    private int idBooking;
    private double advanceDepositAmount;// số tiền cọc trước
    private double totalPaymentAmount;// tổng số tiền thanh toán
    private int idCustomer;// mã khách hàng

    public Contract(int numberContract, int idBooking, double advanceDepositAmount, double totalPaymentAmount, int idCustomer) {
        this.numberContract = numberContract;
        this.idBooking = idBooking;
        this.advanceDepositAmount = advanceDepositAmount;
        this.totalPaymentAmount = totalPaymentAmount;
        this.idCustomer = idCustomer;
    }

    public Contract() {
    }

    public int getNumberContract() {
        return numberContract;
    }

    public void setNumberContract(int numberContract) {
        this.numberContract = numberContract;
    }

    public int getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(int idBooking) {
        this.idBooking = idBooking;
    }

    public double getAdvanceDepositAmount() {
        return advanceDepositAmount;
    }

    public void setAdvanceDepositAmount(double advanceDepositAmount) {
        this.advanceDepositAmount = advanceDepositAmount;
    }

    public double getTotalPaymentAmount() {
        return totalPaymentAmount;
    }

    public void setTotalPaymentAmount(double totalPaymentAmount) {
        this.totalPaymentAmount = totalPaymentAmount;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    @Override
    public String toString() {
        return
                numberContract +
                        "," + idBooking +
                        "," + advanceDepositAmount +
                        "," + totalPaymentAmount +
                        "," + idCustomer;

    }
}
