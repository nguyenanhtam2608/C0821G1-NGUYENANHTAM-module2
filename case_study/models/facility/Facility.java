package case_study.models.facility;

public abstract class Facility {
        private String serviceName;// tên dịch vụ
        private double usableArea;//diện tích sử dụng
        private double costToRent;//Chi phí thuê
        private int maximumNumberOfPeople;// số lượng người tối đa
        private String rentalType;// kiểu thuê

        public Facility() {
        }

        public Facility(String serviceName, double usableArea, double costToRent, int maximumNumberOfPeople, String rentalType) {
                this.serviceName = serviceName;
                this.usableArea = usableArea;
                this.costToRent = costToRent;
                this.maximumNumberOfPeople = maximumNumberOfPeople;
                this.rentalType = rentalType;
        }

        public String getServiceName() {
                return serviceName;
        }

        public void setServiceName(String serviceName) {
                this.serviceName = serviceName;
        }

        public double getUsableArea() {
                return usableArea;
        }

        public void setUsableArea(double usableArea) {
                this.usableArea = usableArea;
        }

        public double getCostToRent() {
                return costToRent;
        }

        public void setCostToRent(double costToRent) {
                this.costToRent = costToRent;
        }

        public int getMaximumNumberOfPeople() {
                return maximumNumberOfPeople;
        }

        public void setMaximumNumberOfPeople(int maximumNumberOfPeople) {
                this.maximumNumberOfPeople = maximumNumberOfPeople;
        }

        public String getRentalType() {
                return rentalType;
        }

        public void setRentalType(String rentalType) {
                this.rentalType = rentalType;
        }

        @Override
        public String toString() {
                return  "serviceName='" + serviceName + '\'' +
                        ", usableArea=" + usableArea +
                        ", costToRent=" + costToRent +
                        ", maximumNumberOfPeople=" + maximumNumberOfPeople +
                        ", rentalType='" + rentalType + '\'' ;

        }
}
