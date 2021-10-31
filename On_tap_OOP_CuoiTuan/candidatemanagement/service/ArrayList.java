package on_tap_oop_cuoituan.candidatemanagement.service;

import on_tap_oop_cuoituan.candidatemanagement.model.Experience;
import on_tap_oop_cuoituan.candidatemanagement.model.Fresher;
import on_tap_oop_cuoituan.candidatemanagement.model.Intern;

import java.io.FileWriter;
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

  public static void writeFile(FileWriter fileWriter , Experience writefile ){
        try {
            fileWriter.write(String.valueOf(writefile));
            fileWriter.close();
            System.out.println("Write success!!!");
        }catch (Exception e){
            System.err.println("Not!!!");
        }

  }

}
