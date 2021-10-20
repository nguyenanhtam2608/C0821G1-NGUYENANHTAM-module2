package bai_11_java_collection_framework.thuchanh;

import on_tap_oop_cuoituan.StudentTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Mains {
    public static void main(String[] args) {
        StudentComparable student = new StudentComparable("Kien", 30, "HT");
        StudentComparable student1 = new StudentComparable("Nam", 26, "HN");
        StudentComparable student2 = new StudentComparable("Anh", 38, "HT");
        StudentComparable student3 = new StudentComparable("Tung", 38, "HT");

        List<StudentComparable> lists = new ArrayList<StudentComparable>();
        lists.add(student);
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        Collections.sort(lists);
        for (StudentComparable st : lists) {
            System.out.println(st.toString());
        }

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lists, ageComparator);
        System.out.println("So sanh theo tuoi:");
        for (StudentComparable st : lists) {
            System.out.println(st.toString());
        }
    }
}