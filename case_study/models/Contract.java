package case_study.models;

public class Contract {
    private int numberContract;
    private int idBooking;
    private int advanceDepositAmount;// số tiền cọc trước
    private int totalPaymentAmount;// tổng số tiền thanh toán
    private int idCustomer;// mã khách hàng

    public Contract(int numberContract, int idBooking, int advanceDepositAmount, int totalPaymentAmount, int idCustomer) {
        this.numberContract = numberContract;
        this.idBooking = idBooking;
        this.advanceDepositAmount = advanceDepositAmount;
        this.totalPaymentAmount = totalPaymentAmount;
        this.idCustomer = idCustomer;
    }

    public Contract() {
    }

    @Override
    public String toString() {
        return "Contract{" +
                "numberContract=" + numberContract +
                ", idBooking=" + idBooking +
                ", advanceDepositAmount=" + advanceDepositAmount +
                ", totalPaymentAmount=" + totalPaymentAmount +
                ", idCustomer=" + idCustomer +
                '}';
    }
}
