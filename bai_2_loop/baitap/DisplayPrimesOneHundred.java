package bai_2_loop.baitap;
public class DisplayPrimesOneHundred {
    public static void main(String[] args) {

        for (int n = 2; n <= 100; n++) {// Run từ 2 đến <100
            boolean check = true;

            for (int i = 2; i < n; i++) {
                if (n % i == 0) {// Nếu không chia hết check ==  true;
                    check = false;
                }
            }
            if (check) {// nếu check  = true  thì in ra n đó và quay trở lại kiểm tra vòng lặp
                System.out.println(n);
            }
        }
    }
}
