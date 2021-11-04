package case_study.models;

public class Booking {
    private int idBooking;
    private String dayStart;
    private String dayEnd;
    private int idCustomer;
    private String nameServices;
    private String typeServices;

    public Booking(int idBooking, String dayStart, String dayEnd, int idCustomer, String nameServices, String typeServices) {
        this.idBooking = idBooking;
        this.dayStart = dayStart;
        this.dayEnd = dayEnd;
        this.idCustomer = idCustomer;
        this.nameServices = nameServices;
        this.typeServices = typeServices;
    }

    public Booking() {
    }

    public int getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(int idBooking) {
        this.idBooking = idBooking;
    }

    public String getDayStart() {
        return dayStart;
    }

    public void setDayStart(String dayStart) {
        this.dayStart = dayStart;
    }

    public String getDayEnd() {
        return dayEnd;
    }

    public void setDayEnd(String dayEnd) {
        this.dayEnd = dayEnd;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getNameServices() {
        return nameServices;
    }

    public void setNameServices(String nameServices) {
        this.nameServices = nameServices;
    }

    public String getTypeServices() {
        return typeServices;
    }

    public void setTypeServices(String typeServices) {
        this.typeServices = typeServices;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "idBooking=" + idBooking +
                ", dayStart='" + dayStart + '\'' +
                ", dayEnd='" + dayEnd + '\'' +
                ", idCustomer=" + idCustomer +
                ", nameServices='" + nameServices + '\'' +
                ", typeServices='" + typeServices + '\'' +
                '}';
    }
}
