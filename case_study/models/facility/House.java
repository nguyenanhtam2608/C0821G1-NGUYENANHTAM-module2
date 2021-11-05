package case_study.models.facility;

public class House extends Facility {
    private String roomStandard; //  tiêu chuẩn phòng
    private int numberOfFloors;// số tầng

    public House(String roomStandard, int numberOfFloors) {
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public House() {
    }

    public House(String serviceName, double usableArea, double costToRent, int maximumNumberOfPeople, String rentalType, String roomStandard, int numberOfFloors) {
        super(serviceName, usableArea, costToRent, maximumNumberOfPeople, rentalType);
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return super.toString()+
                "," + roomStandard + '\'' +
                "," + numberOfFloors ;
    }
}
