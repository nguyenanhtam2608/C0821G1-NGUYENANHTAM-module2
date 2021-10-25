package on_tap_oop_cuoituan.candidatemanagement;

import java.util.List;

public class ArrayList {
    public List<Experience> experienceList;


    public ArrayList() {
        experienceList = new java.util.ArrayList<>();
    }

    public ArrayList(List<Experience> experienceList) {
        this.experienceList = experienceList;
    }

    public List<Experience> getExperienceList() {
        return experienceList;
    }

    public void setExperienceList(List<Experience> experienceList) {
        this.experienceList = experienceList;
    }

    public void addExp(Experience experience) {
        experienceList.add(experience);

    }

    public void addExp(int idExp, String firsNameExp, String lastNameExp, String birthDateExp, String adderssExp, long phoneExp, String email, int experience, int expInYear, String proSkill) {
    }



}
