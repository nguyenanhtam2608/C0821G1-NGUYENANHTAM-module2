package on_tap_oop_cuoituan.candidatemanagement.service;

import on_tap_oop_cuoituan.candidatemanagement.model.Fresher;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class ArrayListFre {
    List<Fresher> fresherList;

    public ArrayListFre(List<Fresher> fresherList) {
        this.fresherList = fresherList;
    }

    public ArrayListFre() {
        fresherList = new ArrayList<>();
    }

    public List<Fresher> getFresherList() {
        return fresherList;
    }

    public void setFresherList(List<Fresher> fresherList) {
        this.fresherList = fresherList;
    }
    public void addFre(Fresher fresher){
        fresherList.add(fresher);
    }
    public void addFre(int idFre, String firsNameFre, String lastNameFre, String birthDateFre, String adderssFre, long phoneFre, String emailFre, int fresheCandidate, String draduationDate, int graduationRank, String schoolFre) {
    }
    public void DisplayFre(){
        System.out.println(fresherList);
    }

    public static void writeFile(FileWriter fileWriter , Fresher writeFileFre) {
        try {
            fileWriter.write(String.valueOf(writeFileFre));
            fileWriter.close();
            System.out.println("Thành Công");
        }catch (Exception e){
            System.err.println("Not!!!");
        }
    }

}
