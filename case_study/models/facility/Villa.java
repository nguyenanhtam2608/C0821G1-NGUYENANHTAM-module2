package case_study.models.facility;

public class Villa extends Facility{
        private String roomStandard; //  tiêu chuẩn phòng
        private double poolArea ;// diện tích  hồ bơi
        private int numberOfFloors;// số tầng

        public Villa() {
        }

        public Villa(String roomStandard, double poolArea, int numberOfFloors) {
                this.roomStandard = roomStandard;
                this.poolArea = poolArea;
                this.numberOfFloors = numberOfFloors;
        }

        public Villa(String serviceName, double usableArea, double costToRent, int maximumNumberOfPeople, String rentalType, String roomStandard, double poolArea, int numberOfFloors) {
                super(serviceName, usableArea, costToRent, maximumNumberOfPeople, rentalType);
                this.roomStandard = roomStandard;
                this.poolArea = poolArea;
                this.numberOfFloors = numberOfFloors;
        }

        public String getRoomStandard() {
                return roomStandard;
        }

        public void setRoomStandard(String roomStandard) {
                this.roomStandard = roomStandard;
        }

        public double getPoolArea() {
                return poolArea;
        }

        public void setPoolArea(double poolArea) {
                this.poolArea = poolArea;
        }

        public int getNumberOfFloors() {
                return numberOfFloors;
        }

        public void setNumberOfFloors(int numberOfFloors) {
                this.numberOfFloors = numberOfFloors;
        }

        @Override
        public String toString() {
                return super.toString() +
                        "," + roomStandard + '\'' +
                        "," + poolArea +
                        "," + numberOfFloors ;
        }
}
