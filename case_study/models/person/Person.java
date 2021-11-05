package case_study.models.person;

public abstract class Person {
    private int id;
    private String name;
    private String birthday;
    private String sex;
    private String cmnd;
    private String phone;
    private String email;

    public Person() {
    }

    public Person(int id, String name, String birthday, String sex, String cmnd, String phone, String email) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.sex = sex;
        this.cmnd = cmnd;
        this.phone = phone;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return
                id +
                        "," + name +
                        "," + birthday +
                        "," + sex +
                        "," + cmnd +
                        "," + phone +
                        "," + email;
    }
}
