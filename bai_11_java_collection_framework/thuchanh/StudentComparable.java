package bai_11_java_collection_framework.thuchanh;

public class StudentComparable implements Comparable<StudentComparable>{

    private String name;
    private Integer age;
    private String address;

    public StudentComparable() {
    }

    public StudentComparable(String name, Integer age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "StudentComparable{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public int compareTo(StudentComparable studentComparable) {
        return this.getName().compareTo(studentComparable.getName());
    }
}
