package bai_11_java_collection_framework.baitap;

import java.util.Comparator;

public class SortArrayListDecrease implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {// giảm dần
        double result = o1.getValueProduct() - o2.getValueProduct();
        if (result > 0) {
            return -1;
        } else if (result < 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
