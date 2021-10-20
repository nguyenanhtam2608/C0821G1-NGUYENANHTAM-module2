package bai_11_java_collection_framework.thuchanh;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        //Tạo HashMap trong main để lưu danh sách sinh viên
        //hashMap :
        // key không trùng lặp
        // key có thể có 1 giá trị null
        // không đảm  bảo thứ tự chèn vào
        Map<String,Integer> hashMap = new HashMap<>();
        hashMap.put("Smith", 30);
        hashMap.put("Anderson", 31);
        hashMap.put("Lewis", 29);
        hashMap.put("Cook", 29);

        System.out.println("Display entries in HashMap");
        System.out.println(hashMap + "\n");  // không đảm  bảo thứ tự chèn vào
                                            // kết quả :{Lewis=29, Smith=30, Cook=29, Anderson=31}


        // treeMap thì key không được có giá trị null
      Map<String ,Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);//duy trì phần tử đc thêm vào theo thứ tự sắp xếp mặt định tăng dần của key
                                   // kết quả : {Anderson=31, Cook=29, Lewis=29, Smith=30}



        //duy trì thứu tự chèn vào
        Map<String,Integer> linkedHashMap = new LinkedHashMap<>(16,0.75f,true);
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Lewis", 29);
        linkedHashMap.put("Cook", 29);
        System.out.println("\nThe age for " + "Lewis is " + linkedHashMap.get("Lewis"));
        //The age for Lewis is 29
    }
}
