package bai_5_access_modifiier.thuchanh;

public class StaticMethod {
    private int rollno;
    private String name;
    private static String college = "BBDIT";

    StaticMethod(int r, String n) {
        rollno = r;
        name = n;
    }

    static void change() {
        college = "CODEGYM";
    }

    void Display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}

