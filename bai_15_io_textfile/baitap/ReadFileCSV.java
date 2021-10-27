package bai_15_io_textfile.baitap;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFileCSV {
    public static List<Country> readCSV() {
        List<Country> countryList = new ArrayList<>();// tạo 1 arrayList
        BufferedReader bufferedReader = null;
        FileReader fileReader = null;

        try {
            FileReader fileReader1 = new FileReader("D:\\Inteillj_idea\\Module__2\\src\\io_textfile\\baitap\\country.csv");
            bufferedReader= new BufferedReader(fileReader1);

            String line;
            String[] temp;
            Country country;
            while ((line = bufferedReader.readLine()) != null){
                temp = line.split(",");
                country = new Country(Integer.parseInt(temp[0]), temp[1], temp[2]);
                countryList.add(country);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return countryList;
    }

    public static void main(String[] args) {
        List<Country> countryList = readCSV();
        for (Country country: countryList){
            System.out.println(country);
        }
    }
}
