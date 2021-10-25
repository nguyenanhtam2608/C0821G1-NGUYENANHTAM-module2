package on_tap_oop_cuoituan.candidatemanagement;

import java.util.Objects;

public class Experience {
    private int idExp;
    private String firsNameExp;
    private String lastNameExp;
    private String birthDateExp;
    private String adderssExp;
    private long phoneExp;
    private String emailExp;
    private int experience = 0;// loại ứng viên
    private int expInYear;// năm kinh ngiệm
    private String proSkill; // kĩ năng chuyên môn;

    public Experience() {
    }

    public Experience(String firsNameExp, String lastNameExp, String birthDateExp, String adderssExp, long phoneExp, String emailExp, int experience) {
        this.firsNameExp = firsNameExp;
        this.lastNameExp = lastNameExp;
        this.birthDateExp = birthDateExp;
        this.adderssExp = adderssExp;
        this.phoneExp = phoneExp;
        this.emailExp = emailExp;
        this.experience = experience;
    }

    public Experience(int idExp, String firsNameExp, String lastNameExp, String birthDateExp, String adderssExp, long phoneExp, String emailExp, int experience, int expInYear, String proSkill) {
        this.idExp = idExp;
        this.firsNameExp = firsNameExp;
        this.lastNameExp = lastNameExp;
        this.birthDateExp = birthDateExp;
        this.adderssExp = adderssExp;
        this.phoneExp = phoneExp;
        this.emailExp = emailExp;
        this.experience = experience;
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }



    public int getIdExp() {
        return idExp;
    }

    public void setIdExp(int idExp) {
        this.idExp = idExp;
    }

    public String getFirsNameExp() {
        return firsNameExp;
    }

    public void setFirsNameExp(String firsNameExp) {
        this.firsNameExp = firsNameExp;
    }

    public String getLastNameExp() {
        return lastNameExp;
    }

    public void setLastNameExp(String lastNameExp) {
        this.lastNameExp = lastNameExp;
    }

    public String getBirthDateExp() {
        return birthDateExp;
    }

    public void setBirthDateExp(String birthDateExp) {
        this.birthDateExp = birthDateExp;
    }

    public String getAdderssExp() {
        return adderssExp;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setAdderssExp(String adderssExp) {
        this.adderssExp = adderssExp;
    }

    public long getPhoneExp() {
        return phoneExp;
    }

    public void setPhoneExp(long phoneExp) {
        this.phoneExp = phoneExp;
    }

    public String getEmailExp() {
        return emailExp;
    }

    public void setEmailExp(String emailExp) {
        this.emailExp = emailExp;
    }


    public int getExpInYear() {
        return expInYear;
    }

    public void setExpInYear(int expInYear) {
        this.expInYear = expInYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    @Override
    public String toString() {
        return "Experience{" +
                "idExp=" + idExp +
                ", firsNameExp='" + firsNameExp + '\'' +
                ", lastNameExp='" + lastNameExp + '\'' +
                ", birthDateExp=" + birthDateExp +
                ", adderssExp='" + adderssExp + '\'' +
                ", phoneExp=" + phoneExp +
                ", emailExp='" + emailExp + '\'' +
                ", internCandidate=" + experience +
                ", expInYear=" + expInYear +
                ", proSkill='" + proSkill + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Experience that = (Experience) o;
        return idExp == that.idExp && phoneExp == that.phoneExp && experience == that.experience && expInYear == that.expInYear && Objects.equals(firsNameExp, that.firsNameExp) && Objects.equals(lastNameExp, that.lastNameExp) && Objects.equals(birthDateExp, that.birthDateExp) && Objects.equals(adderssExp, that.adderssExp) && Objects.equals(emailExp, that.emailExp) && Objects.equals(proSkill, that.proSkill);
    }


}
