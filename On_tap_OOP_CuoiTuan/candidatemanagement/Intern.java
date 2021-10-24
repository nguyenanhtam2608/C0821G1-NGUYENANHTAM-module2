package on_tap_oop_cuoituan.candidatemanagement;

import java.util.Date;

public class Intern {
    private int idInt;
    private String firsNameInt;
    private String lastNameInt;
    private String birthDateInt;
    private String adderssInt;
    private long phoneInt;
    private String emailInt;
    private int internCandidate = 2;
    private String majors;//chuyên ngành
    private int semester;//học kì;
    private String schoolInt;// trường đại học;

    public Intern() {
    }

    public Intern(int idInt, String firsNameInt, String lastNameInt, String birthDateInt, long phoneInt, String emailInt, int internCandidate, String majors, int semester, String schoolInt) {
        this.idInt = idInt;
        this.firsNameInt = firsNameInt;
        this.lastNameInt = lastNameInt;
        this.birthDateInt = birthDateInt;
        this.adderssInt = adderssInt;
        this.phoneInt = phoneInt;
        this.emailInt = emailInt;
        this.internCandidate = internCandidate;
        this.majors = majors;
        this.semester = semester;
        this.schoolInt = schoolInt;
    }

    public int getIdInt() {
        return idInt;
    }

    public void setIdInt(int idInt) {
        this.idInt = idInt;
    }

    public String getFirsNameInt() {
        return firsNameInt;
    }

    public void setFirsNameInt(String firsNameInt) {
        this.firsNameInt = firsNameInt;
    }

    public String getLastNameInt() {
        return lastNameInt;
    }

    public void setLastNameInt(String lastNameInt) {
        this.lastNameInt = lastNameInt;
    }

    public String getBirthDateInt() {
        return birthDateInt;
    }

    public void setBirthDateInt(String birthDateInt) {
        this.birthDateInt = birthDateInt;
    }

    public String getAdderssInt() {
        return adderssInt;
    }

    public void setAdderssInt(String adderssInt) {
        this.adderssInt = adderssInt;
    }

    public long getPhoneInt() {
        return phoneInt;
    }

    public void setPhoneInt(long phoneInt) {
        this.phoneInt = phoneInt;
    }

    public String getEmailInt() {
        return emailInt;
    }

    public void setEmailInt(String emailInt) {
        this.emailInt = emailInt;
    }

    public void setInternCandidate(int internCandidate) {
        this.internCandidate = internCandidate;
    }

    public int getInternCandidate() {
        return internCandidate;
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getSchoolInt() {
        return schoolInt;
    }

    public void setSchoolInt(String schoolInt) {
        this.schoolInt = schoolInt;
    }

    @Override
    public String toString() {
        return "Intern{" +
                "idInt=" + idInt +
                ", firsNameInt='" + firsNameInt + '\'' +
                ", lastNameInt='" + lastNameInt + '\'' +
                ", birthDateInt=" + birthDateInt +
                ", adderssInt='" + adderssInt + '\'' +
                ", phoneInt=" + phoneInt +
                ", emailInt='" + emailInt + '\'' +
                ", internCandidate=" + internCandidate +
                ", majors='" + majors + '\'' +
                ", semester=" + semester +
                ", schoolInt='" + schoolInt + '\'' +
                '}';
    }
}
