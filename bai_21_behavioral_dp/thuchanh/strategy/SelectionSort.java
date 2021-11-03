package bai_21_behavioral_dp.thuchanh.strategy;

import java.util.List;

public class SelectionSort implements SortStrategy{
    @Override
    public <T> void sort(List<T> items) {
        System.out.println("Selection sort");
    }
}
