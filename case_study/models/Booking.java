package case_study.models;

public class Booking {
    private int idBooking;
    private String dayStart;
    private String dayEnd;
    private String idCustomer;
    private String nameServices;
    private String typeServices;

    public Booking(int idBooking, String dayStart, String dayEnd, String idCustomer, String nameServices, String typeServices) {
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

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
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
        return
                idBooking +
                        "," + dayStart +
                        "," + dayEnd +
                        "," + idCustomer +
                        "," + nameServices +
                        "," + typeServices;
    }
}
