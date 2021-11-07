package case_study.validate_readwritefile.readwritefile;

import case_study.models.Contract;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteReadFileContract {
    public static final String CONTRACT = "D:\\Inteillj_idea\\Module__2\\src\\case_study\\data\\contract.csv";

    public static void writeFileContract(Contract contract, String path) {
        try {
            FileWriter fileWriter = new FileWriter(path, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(contract.toString());
            bufferedWriter.newLine();
            bufferedWriter.close();
            System.out.println("Ghi thành công");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Contract> readContract(String path) {
        List<Contract> contractList = new ArrayList<>();
        BufferedReader bufferedReader;
        try {
            FileReader fileReader = new FileReader(path);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] temp;
            Contract contract;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                contract = new Contract(Integer.parseInt(temp[0]), Integer.parseInt(temp[1]), Double.parseDouble(temp[2]), Double.parseDouble(temp[3]), Integer.parseInt(temp[4]));
                contractList.add(contract);
            }
            bufferedReader.close();
            System.out.println("đọc thành công");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Contract contract : contractList) {
            System.out.println(contract);
        }
        return contractList;
    }
}
