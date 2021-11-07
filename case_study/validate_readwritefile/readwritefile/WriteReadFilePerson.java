package case_study.validate_readwritefile.readwritefile;

import case_study.models.person.Customer;
import case_study.models.person.Employee;
import case_study.models.person.Person;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteReadFilePerson {
    public static final String WRITEEMP = "D:\\Inteillj_idea\\Module__2\\src\\case_study\\data\\employee.csv";
    public static final String WRITECUS = "D:\\Inteillj_idea\\Module__2\\src\\case_study\\data\\customer.csv";

    public static void writePreson(Person person, String path) throws IOException {
        FileWriter fileWriterEmp = new FileWriter(path, true);
        BufferedWriter bufferedWriterPre = new BufferedWriter(fileWriterEmp);
        bufferedWriterPre.write(person.toString());
        bufferedWriterPre.newLine();
        bufferedWriterPre.close();
    }

    public static List<Person> readPreson(String path) {
        List<Person> personList = new ArrayList<>();
        BufferedReader bufferedReaderPre;
        try {
            FileReader fileReader = new FileReader(path);
            bufferedReaderPre = new BufferedReader(fileReader);
            String line;
            String[] temp;
            Person customer, employee;
            while ((line = bufferedReaderPre.readLine()) != null) {
                temp = line.split(",");
                if (temp.length == 9) {
                    customer = new Customer(Integer.parseInt(temp[0]), temp[1], temp[2], temp[3], temp[4], temp[5], temp[6], temp[7], temp[8]);
                    personList.add(customer);
                }
                if (temp.length == 10) {
                    employee = new Employee(Integer.parseInt(temp[0]), temp[1], temp[2], temp[3], temp[4], temp[5], temp[6], temp[7], temp[8], Double.parseDouble(temp[9]));
                    personList.add(employee);
                }
            }
            bufferedReaderPre.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return personList;
    }
}
