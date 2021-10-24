package on_tap_oop_cuoituan.candidatemanagement;

import java.util.Date;

public class Fresher {
    private int idFre;
    private String firsNameFre;
    private String lastNameFre;
    private String birthDateFre;
    private String adderssFre;
    private long phoneFre;
    private String emailFre;
    private int fresheCandidate = 1;
    private String draduationDate; // thời gian tốt nghiệp;
    private int graduationRank;// xếp hạng tốt nghiệp
    private String schoolFre;// trường đại học;


    public Fresher(int idFre, String firsNameFre, String lastNameFre, String birthDateFre, String adderssFre, long phoneFre, String emailFre, int fresheCandidate, String draduationDate, int graduationRank, String schoolFre) {
        this.idFre = idFre;
        this.firsNameFre = firsNameFre;
        this.lastNameFre = lastNameFre;
        this.birthDateFre = birthDateFre;
        this.adderssFre = adderssFre;
        this.phoneFre = phoneFre;
        this.emailFre = emailFre;
        this.fresheCandidate = fresheCandidate;
        this.draduationDate = draduationDate;
        this.graduationRank = graduationRank;
        this.schoolFre = schoolFre;
    }

    public String getFirsNameFre() {
        return firsNameFre;
    }

    public void setFirsNameFre(String firsNameFre) {
        this.firsNameFre = firsNameFre;
    }

    public String getLastNameFre() {
        return lastNameFre;
    }

    public void setLastNameFre(String lastNameFre) {
        this.lastNameFre = lastNameFre;
    }

    public String getBirthDateFre() {
        return birthDateFre;
    }

    public void setBirthDateFre(String birthDateFre) {
        this.birthDateFre = birthDateFre;
    }

    public String getAdderssFre() {
        return adderssFre;
    }

    public void setAdderssFre(String adderssFre) {
        this.adderssFre = adderssFre;
    }

    public long getPhoneFre() {
        return phoneFre;
    }

    public void setPhoneFre(long phoneFre) {
        this.phoneFre = phoneFre;
    }

    public String getEmailFre() {
        return emailFre;
    }

    public void setEmailFre(String emailFre) {
        this.emailFre = emailFre;
    }

    public int getFresheCandidate() {
        return fresheCandidate;
    }

    public void setFresheCandidate(int fresheCandidate) {
        this.fresheCandidate = fresheCandidate;
    }

    public String getDraduationDate() {
        return draduationDate;
    }

    public void setDraduationDate(String draduationDate) {
        this.draduationDate = draduationDate;
    }

    public int getGraduationRank() {
        return graduationRank;
    }

    public void setGraduationRank(int graduationRank) {
        this.graduationRank = graduationRank;
    }

    public String getSchoolFre() {
        return schoolFre;
    }

    public void setSchoolFre(String schoolFre) {
        this.schoolFre = schoolFre;
    }

    @Override
    public String toString() {
        return "Fresher{" +
                "firsNameFre='" + firsNameFre + '\'' +
                ", lastNameFre='" + lastNameFre + '\'' +
                ", birthDateFre='" + birthDateFre + '\'' +
                ", adderssFre='" + adderssFre + '\'' +
                ", phoneFre=" + phoneFre +
                ", emailFre='" + emailFre + '\'' +
                ", fresheCandidate=" + fresheCandidate +
                ", draduationDate='" + draduationDate + '\'' +
                ", graduationRank='" + graduationRank + '\'' +
                ", schoolFre='" + schoolFre + '\'' +
                '}';
    }
}