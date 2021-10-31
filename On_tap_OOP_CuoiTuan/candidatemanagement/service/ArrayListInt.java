package on_tap_oop_cuoituan.candidatemanagement.service;

import on_tap_oop_cuoituan.candidatemanagement.model.Intern;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class ArrayListInt {
    private List<Intern> internList;

    public ArrayListInt(List<Intern> internList) {
        this.internList = internList;
    }

    public ArrayListInt() {
        internList = new ArrayList<>();
    }

    public List<Intern> getInternList() {
        return internList;
    }

    public void setInternList(List<Intern> internList) {
        this.internList = internList;
    }

    public void addInt(Intern intern) {
        internList.add(intern);
    }

    public void addInt(int idInt, String firsNameInt, String lastNameInt, String birthDateInt, Long phoneInt, String emailInt, int internCandidate, String majors, int semester, String schoolInt) {
    }

    public void DisplayInt() {
        System.out.println(internList);
    }

    public static void writeFile(FileWriter fileWriter, Intern writeFileInt) {
        try {
            fileWriter.write(String.valueOf(writeFileInt));
            fileWriter.close();
            System.out.println("Thành Công");
        }catch (Exception e){
            System.err.println("Not!!!1");
        }
    }

}
