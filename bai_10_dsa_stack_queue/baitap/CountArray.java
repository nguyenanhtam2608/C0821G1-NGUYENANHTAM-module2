package bai_10_dsa_stack_queue.baitap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập chuỗi muốn đếm ");
        String enter = input.nextLine();
    // tạo một mảng kiểu String
        String [] arr = enter.toLowerCase().split(" ");// chuyển chuoxi thành mảng"split"
        System.out.println(Arrays.toString(arr));// Arrays.toString() để hiển thị mảng;
        Map<String,Integer> map = new HashMap<>();
        for (int i = 0 ; i< arr.length;i++){
            String key = arr[i]; // mỗi key được lưu dưới dạng là mỗi y , chạy hết vòng for sẽ lưu hết key vào i
            if(map.containsKey(key)){
                int count = map.get(key);// lấy value;
                //cap nhat gia tri value cua 1 key trong map

                map.put(key,count +1);
            }else {
                map.put(key,1);
            }
        }
        System.out.println(map);
    }
}
