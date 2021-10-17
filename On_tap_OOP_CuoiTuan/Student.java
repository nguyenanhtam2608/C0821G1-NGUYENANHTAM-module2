package on_tap_oop_cuoituan;

public class Student {
    private int idStudent;
    private String nameStudent;
    private String address;
    private double point;

    public Student() {
    }



    public Student(int idStudent, String nameStudent, String address, double point) {
        this.idStudent = idStudent;
        this.nameStudent = nameStudent;
        this.address = address;
        this.point = point;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Student{" +
                "idStudent=" + idStudent +
                ", nameStudent='" + nameStudent + '\'' +
                ", address='" + address + '\'' +
                ", point=" + point +
                '}' + "\n";
    }

}
