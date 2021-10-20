package bai_11_java_collection_framework.baitap;

import java.util.Comparator;

public class SortArrayListAscending implements Comparator<Product> {


    @Override
    public int compare(Product o1, Product o2) {// tăng dần
        double rusult = o1.getValueProduct() - o2.getValueProduct();
        if (rusult > 0) {
            return 1;
        } else if (rusult < 0) {
            return -1;
        }
              else {
                  return 0;
        }
    }
}
