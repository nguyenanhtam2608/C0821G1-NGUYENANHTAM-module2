package case_study.services.impl;

import case_study.models.person.Employee;
import case_study.models.person.Person;
import case_study.services.EmployeeService;
import case_study.validate_readwritefile.validate.ValidateEmp;
import case_study.validate_readwritefile.readwritefile.WriteReadFilePerson;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    private List<Person> personList;

    public EmployeeServiceImpl(List<Person> personList) {
        this.personList = personList;
    }

    public EmployeeServiceImpl() {
        personList = new ArrayList<>();
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }


    Scanner input = new Scanner(System.in);

    Employee employee = new Employee(1, "Nguyễn Anh Tâm", "26/08/2002", "Nam", "206406031", "0763709673", "nguyenanhtam@gmail.com", "đại học", "Giám đốc", 10);
    Employee employee1 = new Employee(2, "Nguyễn Anh Tâm", "26/08/2002", "Nam", "206406031", "0763709673", "nguyenanhtam@gmail.com", "đại học", "Giám đốc", 10);


    @Override
    public void disPlay() {
        personList.add(employee);
        personList.add(employee1);
        for (Person person : personList) {
            System.out.println(person);
        }


    }

    @Override
    public void add() {
        System.out.println("Nhập id ");
        int id = Integer.parseInt(input.nextLine());
        System.out.println("Nhập tên ");
        String name = input.nextLine();
        String birth = ValidateEmp.birthday();
        System.out.println("Nhập giới tính");
        String sex = input.nextLine();
        String cmnd = (String) ValidateEmp.cmnd();
        String phone = ValidateEmp.phone();
        String email = ValidateEmp.email();
        //Trình độ sẽ lưu trữ các thông tin: Trung cấp, Cao đẳng, Đại học và sau đại học
        String level = ValidateEmp.level();
        //Vị trí sẽ lưu trữ các thông tin: Lễ tân, phục vụ, chuyên viên, giám sát, quản lý, giám đốc
        String location = ValidateEmp.location();
        double wage = ValidateEmp.wage();
        Employee employee = new Employee(id, name, birth, sex, cmnd, phone, email, level, location, wage);
        personList.add(employee);
        try {
            WriteReadFilePerson.writePreson(employee, WriteReadFilePerson.WRITEEMP);
            System.out.println("Ghi thành công");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    @Override
    public void edit() {
        boolean check = false;
        disPlay();
        System.out.println("Nhập id mà bạn muốn sửa");
        int id = Integer.parseInt(input.nextLine());
        for(int i = 0 ; i<personList.size();i++) {
            if (id == getPersonList().get(i).getId()) {
                check =true;
            }
            if(check ){
                personList.remove(getPersonList().get(i));
                add();
                break;
            }else {
                add();
                break;
            }
        }
        for (Person person : personList) {
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
