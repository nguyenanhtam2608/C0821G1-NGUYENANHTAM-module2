package case_study.services.impl;

import case_study.models.person.Customer;
import case_study.models.person.Person;
import case_study.services.CustomerService;
import case_study.validate_readwritefile.validate.ValidateCus;
import case_study.validate_readwritefile.readwritefile.WriteReadFilePerson;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    List<Person> personLinkedList;

    public CustomerServiceImpl() {
        personLinkedList = new LinkedList<>();
    }

    public CustomerServiceImpl(List<Person> personList) {
        this.personLinkedList = personList;
    }

    public List<Person> getPersonLinkedList() {
        return personLinkedList;
    }

    public void setPersonLinkedList(List<Person> personLinkedList) {
        this.personLinkedList = personLinkedList;
    }

    Scanner input = new Scanner(System.in);
    //Loại Customer bao gồm: (Diamond, Platinium, Gold, Silver, Member).
    Customer customer = new Customer(1,"Hồ thải vi","02/01/2002","nữ","123456789","0989098765","thaovi21@gmail.com","Gold","QN");
    Customer customerOne= new Customer(2,"Hồ thải vi","02/01/2002","nữ","123456789","0989098765","thaovi21@gmail.com","Gold","QN");
    @Override
    public void disPlay() {
        personLinkedList.add(customer);
        personLinkedList.add(customerOne);
        for (Person person : personLinkedList){
            System.out.println(person);
        }


    }

    @Override
    public void add() {
        System.out.println("Nhập id ");
        int id = Integer.parseInt(input.nextLine());
        System.out.println("Nhập tên ");
        String name = input.nextLine();
        String birth = ValidateCus.birthday();
        System.out.println("Nhập giới tính");
        String sex = input.nextLine();
        String cmnd = ValidateCus.cmnd();
        String phone = ValidateCus.phone();
        String email = ValidateCus.email();
        String type = ValidateCus.customerType();
        System.out.println("Nhập địa chỉ");
        String address = input.nextLine();
        Customer  customer = new Customer(id,name,birth,sex,cmnd,phone,email,type,address);
        personLinkedList.add(customer);
        try {
            WriteReadFilePerson.writePreson(customer, WriteReadFilePerson.WRITECUS);
            System.out.println("Ghi thành công");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    @Override
    public void edit() {
        boolean check = false;
        disPlay();
        System.out.println("Nhập id bạn muốn sửa");
        int id = Integer.parseInt(input.nextLine());
        for(int i = 0 ; i<personLinkedList.size();i++) {
            if (id == getPersonLinkedList().get(i).getId()) {
                check =true;
            }
            if(check ){
                personLinkedList.remove(getPersonLinkedList().get(i));
                add();
                break;
            }else {
                add();
                break;
            }
        }
        for (Person person : personLinkedList) {
            System.out.println(person);
        }


    }

    @Override
    public void returnMainMenu() {
        System.out.println("1. Employee Management\n" +
                "2. Customer Management\n" +
                "3. Facility Management\n" +
                "4. Booking Management\n" +
                "5. Promotion Management\n" +
                "6. Exit");

    }
}
