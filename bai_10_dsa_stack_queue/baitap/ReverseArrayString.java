package bai_10_dsa_stack_queue.baitap;

import java.util.Stack;

public class ReverseArrayString {
    public static void main(String[] args) {

        Stack<String> strings = new Stack<>();
        String[] string = new String[3];
        string[0] = strings.push("Nguyễn");
        string[1] = strings.push("Anh");
        string[2] = strings.push("Tâm");
        for (String str :string){
            System.out.print(str + " ");
        }
        System.out.println();
        string[0] = strings.peek();
        string[2] = strings.push("Nguyễn");
        for (String str :string){
            System.out.print(str + " ");
        }
    }
}
