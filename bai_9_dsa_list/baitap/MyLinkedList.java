package bai_9_dsa_list.baitap;

import java.security.PublicKey;

public class MyLinkedList<E> {
    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    // phân tử đầu tiên của danh sách liên kết
    private Node head;
    // số lượng phần tử có trong danh sách
    private int numNode = 0;

    public MyLinkedList() {
    }

    public void addFirst(E element) {
// khai báo 1 biến temp con trỏ đến giá trị 1 node mới
        Node temmp = head;
        // biến head sẽ nhận giá trị là 1 node mới
        head = new Node(element);
        //head.next trỏ đến temp
        head.next = temmp;
        numNode++;
    }

    public void addLast(E element) {
        // khai báo biến temp trỏ đến head
        Node temp = head;
        // sẽ cho con trỏ chạy đến phần tử cuối cùng của danh sách
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(element);
        numNode++;
    }

    public void add(int index, E element) {
        // khai báo biến temp trỏ đến head
        Node temp = head;
        // khai báo 1 node là holder
        Node holder;
        // cho con trỏ đến vị trí index -1
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        //cho holder tham chiếu đến vị trí index
        holder = temp.next;
        // Node tại vị trí index -1 sẽ trỏ con trỏ tới node mới
        temp.next = new Node(element);
        //node mới sẽ trỏ đến holeer
        temp.next.next = holder;
        // tawmh spsp lượng phần tử trong danh sách lên 1
        numNode++;
    }

    public Object get(int index) {
        // khai báo biến temp trỏ tới head
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    public int size() {
        return numNode;
    }

    public E remove(int index) {
        if (index < 0 || index > numNode) {
            throw new IllegalArgumentException("Error index" + index);
        }
        // khai báo biến temp trỏ dến head;
        Node temp = head;
        Object data;
        // Nếu index  = = thì sẽ trẻ về dara hiện tại
        if (index == 0) {
            data = temp.data;
            head = head.next;
            numNode--;
        } else {
            for (int i = 0; i < index - 1 && temp.next != null; i++) {
                temp = temp.next;
            }
            data = temp.next.data;
            temp.next = temp.next.next;
            numNode--;
        }
        return (E) data;
    }

    public boolean remove(E element) {
        //remove đối tượng nếu element head;
        if (head.data.equals(element)) {
            remove(0);
            return true;
        } else {
            // khai báo 1 node temp trỏ đén head
            Node temp = head;
            while (temp.next != null) {
                // nếu như tồn tại 1 phần tử có data truyèn vào thì Node đó sẽ bị remove
                if (temp.next.data.equals(element)) {
                    temp.next = temp.next.next;
                    numNode--;
                    return true;
                }
                temp = temp.next;
            }
        }
        return false;
    }

    public MyLinkedList<E> clone() {
        // kiểm tra linkedList có phần tử hay không
        if (numNode == 0) {
            throw new IllegalArgumentException("LinkedListERROR");

        }
        // khai báo linkedList trẻ về
        MyLinkedList<E> returnLinkedList = new MyLinkedList<>();
        // khai báo 1 temp trỏ đên head;
        Node temp = head;
        // add temp voafpo danh sách trả về để nó làm head;

        returnLinkedList.addFirst((E) temp.data);
        temp = temp.next;
        while (temp != null) {
            returnLinkedList.addLast((E) temp.data);
            temp = temp.next;
        }
        return returnLinkedList;
    }

    public boolean constrains(E element) {
        Node temp = head;
        while (temp.next != null) {
            if (temp.data.equals(element)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int indexOf(E element) {
        Node temp = head;
        for (int i = 0; i < numNode; i++) {
            if (temp.getData().equals(element)) {
                return 1;
            }
            temp = temp.next;
        }
        return -1;
    }
}

