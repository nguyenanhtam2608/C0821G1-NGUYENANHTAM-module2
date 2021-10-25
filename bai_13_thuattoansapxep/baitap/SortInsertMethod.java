package bai_13_thuattoansapxep.baitap;

public class SortInsertMethod {
    static class NumberInter {
        int[] number = {4, 3, 5, 67, 23, 6, 7, 2, 64};

        public void sortInsert(int[]number) {
            int i = 0;
            for (i = 0; i < number.length; i++) {

                int key = number[i];
                int j = i - 1;
                while (j >= 0 && number[j] > key) {
                    number[j + 1] = number[j];
                    j--;
                }
                number[j + 1] = key;
            }
        }
    }
}
