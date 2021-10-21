package bai_10_dsa_stack_queue.baitap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class StringCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhâp chuỗi cần đếm ");
        String enter = input.nextLine();
        Map<String, Integer> map = new HashMap<>();
        String kitu;

        for (int i = 0; i < enter.length(); i++) {
            //valueOf method dùng để chuyển đổi kiểu int, long , char... về String
            kitu = String.valueOf(enter.charAt(i)).toLowerCase();
            if (map.containsKey(kitu)) {// kiểm tra xem kí tự có trong map hay không
                //nếu có {
                int currentValue = map.get(kitu);// lấy value và cập nhật key;
                // mỗi key là có 1 value tương ứng nếu get key sẽ trả về 1 value ;

                //cap nhat gia tri value cua 1 key trong map
                map.put(kitu, currentValue + 1);

                //}
            } else {
                // Nếu không có thì sẽ thêm mới giá trị đó mà gán cho value = 1
                map.put(kitu, 1);
            }
        }
        System.out.println(map);
    }

}

