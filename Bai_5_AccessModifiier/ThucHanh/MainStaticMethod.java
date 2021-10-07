package Bai_5_AccessModifiier.ThucHanh;

public class MainStaticMethod {

    public static void main(String[] args) {
        StaticMethod.change();

        StaticMethod s1 = new StaticMethod(111, "Hoàng");
        StaticMethod s2 = new StaticMethod(222, "Khanh");
        StaticMethod s3 = new StaticMethod(333, "Nam");

        s1.Display();
        s2.Display();
        s3.Display();
    }
}
