package bai_11_java_collection_framework.thuchanh;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Nam", 20, "HN");
        Student student2 = new Student("Hung", 21, "HN");
        Student student3 = new Student("Ha", 22, "HN");

        Map<Integer, Student> studentMap = new HashMap<Integer, Student>();
        studentMap.put(1,student1);
        studentMap.put(2,student2);
        studentMap.put(3,student3);
        studentMap.put(4,student1);

        for(Map.Entry<Integer,Student> student : studentMap.entrySet()){
            System.out.println(student.toString());
        }
        System.out.println("..........Set");
        Set<Student> students = new HashSet<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student1);

        for(Student student : students){
            System.out.println(student.toString());
        }
    }
}
// phân biệt haskMap và haskSet
//Hashset là một tập hợp , ví dụ {1,2,3,4,5}
//
//HashMap là bản đồ khóa -> value (key to value), ví dụ {a -> 1, b -> 2, c -> 2, d -> 1}
//
//Lưu ý trong ví dụ ở trên  trong HashMap không được có các khóa trùng lặp, nhưng nó có thể có các giá trị trùng lặp.
//

//Trong Hashset, không được có các phần tử trùng lặp.
//HashMap chứa các cặp giá trị khóa và mỗi giá trị có thể được truy cập bằng khóa trong đó Hashset cần được lặp lại mọi lúc vì không có phương thức get.
//HashMapthực hiện giao diện Bản đồ và cho phép một giá trị null làm khóa và nhiều giá trị null làm giá trị. Trong khi HashSetthực hiện Giao diện cài đặt, chỉ cho phép một giá trị null và không có giá trị trùng lặp. như Hashset triển khai HashMap trong nội bộ).
//HashSetvà HashMapkhông duy trì thứ tự chèn trong khi lặp.