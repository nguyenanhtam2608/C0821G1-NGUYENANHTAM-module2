package on_tap_oop_cuoituan.candidatemanagement;

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
    public void addFre(int idExp, String firsNameFre, String lastNameFre, String birthDateFre, String adderssFre, long phoneFre, String emailFre, int fresheCandidate, String draduationDate, int graduationRank, String schoolFre) {
    }

}
