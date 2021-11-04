package case_study.models.facility;

public class Room extends Facility {
    private String freeServiceIncluded;// dịch vụ miễn phí đi kèm

    public Room() {
    }

    public Room(String freeServiceIncluded) {
        this.freeServiceIncluded = freeServiceIncluded;
    }

    public Room(String serviceName, double usableArea, double costToRent, int maximumNumberOfPeople, String rentalType, String freeServiceIncluded) {
        super(serviceName, usableArea, costToRent, maximumNumberOfPeople, rentalType);
        this.freeServiceIncluded = freeServiceIncluded;
    }

    public String getFreeServiceIncluded() {
        return freeServiceIncluded;
    }

    public void setFreeServiceIncluded(String freeServiceIncluded) {
        this.freeServiceIncluded = freeServiceIncluded;
    }

    @Override
    public String toString() {
        return super.toString() +
                "freeServiceIncluded='" + freeServiceIncluded + '\'' +
                '}';
    }
}
