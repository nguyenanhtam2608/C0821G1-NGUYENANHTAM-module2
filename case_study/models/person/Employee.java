package case_study.models.person;

public class Employee extends Person {
    private String level;//Trình độ sẽ lưu trữ các thông tin: Trung cấp, Cao đẳng, Đại học và sau đại học
    private String location;// Vị trí sẽ lưu trữ các thông tin: Lễ tân, phục vụ, chuyên viên, giám sát, quản lý, giám đốc
    private double wage;// lương

    public Employee() {
    }

    public Employee(String level, String location, double wage) {
        this.level = level;
        this.location = location;
        this.wage = wage;
    }

    public Employee(int id, String name, String birthday, String sex, int cnmd, String phone, String email, String level, String location, double wage) {
        super(id, name, birthday, sex, cnmd, phone, email);
        this.level = level;
        this.location = location;
        this.wage = wage;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return super.toString() +
                "level='" + level + '\'' +
                ", location='" + location + '\'' +
                ", wage=" + wage +
                '}';
    }
}
