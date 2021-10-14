package bai_9_dsa_list.baitap;

import java.util.Arrays;

public class MyList<E> {

    private int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    Object element[];

    // sức chứa mặt định khi khởi tạo contructor k tham số là 10;
    public MyList() {
        element = new Object[DEFAULT_CAPACITY];
    }

    // phương thức contructor có sức chứa truyền vào là "capacity"
    public MyList(int capacity) {
        if (capacity >= 0) {
            element = new Object[capacity];
        } else {
            System.out.println("capacity " + capacity);
        }
    }

    // trả về độ dài của mảng
    public int size() {
        return this.size;
    }

    // Method clear 1 arrayList

    public void clear() {
        size = 0;
        for (int i = 0; i < element.length; i++) {
            element[i] = null;//chạy hết Loop sẽ gán value cho từng element in array = null;
        }
    }

    // phương thức tăng 1 phần tử vào MyList
    public boolean add(E elements) {
        if (element.length == size) {// nếu chiều dài của mảng đã max thì
            this.ensureCapacity(5);// sẽ tăng kích thức của mảng lên 5 đơn vị
        }
        element[size] = elements;
        size++;
        return true;
    }

    public boolean add(MyListTest.StuDent elements, int index) {
        if (index > element.length) {
            System.out.println("index" + index);
        } else if (element.length == size) {
            this.ensureCapacity(5);
        }
        if (element[index] == null) {
            element[index] = elements;
        } else {
            for (int i = size + 1; i >= index; i--) {
                element[i] = element[i - 1];
            }
            element[index] = elements;
            size++;
        }
        return true;
    }

    //phương thức tăng kích thức của MyList
    public void ensureCapacity(int minCapacity) {
        if (minCapacity >= 0) {
            int newSize = this.element.length + minCapacity;
            element = Arrays.copyOf(element, newSize);
        } else {
            System.out.println("minCapacity " + minCapacity);
        }
    }
    //phương thức lấy element tại 1 index bất kì

    public E get(int index) {
        return (E) element[index];
    }

    //phuowmg thức lấy índex 1 phần tử trong mảng
    public int indeOf(E elements) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (this.element[i].equals(elements)) {
                return i;
            }
        }
        return index;
    }

    // phương thức kiểm tra 1 phần tử có trong mảng hay không?
    public boolean contains(E elements) {
        return this.indeOf(elements) >= 0;
    }


    // phương thức tạo ra 1 bản sao của mảng
    public MyList<E> clone() {
        MyList<E> v = new MyList<>();
        v.element = Arrays.copyOf(this.element, this.size);
        v.size = this.size;
        return v;
    }

    //
    public E remove(int index) {
        if (index < 0 || index > element.length) {
            throw new IllegalArgumentException("ERROR index" + index);
        }
        E elements = (E) element[index];
        for (int i = index; i < size - 1; i++) {
            element[i] = element[i + 1];
        }
        element[size - 1] = null;
        size--;
        return elements;

    }
}
