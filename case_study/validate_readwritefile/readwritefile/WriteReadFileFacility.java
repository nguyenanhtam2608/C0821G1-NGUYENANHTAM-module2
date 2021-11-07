package case_study.validate_readwritefile.readwritefile;

import case_study.models.facility.Facility;
import case_study.models.facility.House;
import case_study.models.facility.Room;
import case_study.models.facility.Villa;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WriteReadFileFacility {

    public static final String WRITEVILLA = "D:\\Inteillj_idea\\Module__2\\src\\case_study\\data\\villa.csv";
    public static final String WRITEHOUSE = "D:\\Inteillj_idea\\Module__2\\src\\case_study\\data\\house.csv";
    public static final String WRITEROOM = "D:\\Inteillj_idea\\Module__2\\src\\case_study\\data\\room.csv";

    public static void writeReadFacility(Facility facility, String path) throws IOException {
        FileWriter fileWriterFaci = new FileWriter(path, true);
        BufferedWriter bufferedWriterFaci = new BufferedWriter(fileWriterFaci);
        bufferedWriterFaci.write(facility.toString());
        bufferedWriterFaci.newLine();
        bufferedWriterFaci.close();
    }

    public static List<Facility> readFacility(String path) {
        List<Facility> facilityList = new ArrayList<>();
        BufferedReader bufferedReaderFaci;
        try {
            FileReader fileReaderFaci = new FileReader(path);
            bufferedReaderFaci = new BufferedReader(fileReaderFaci);
            String line;
            String[] temp;
            Facility villa, room, house;
            while ((line = bufferedReaderFaci.readLine()) != null) {
                temp = line.split(",");
                if (temp.length == 8) {
                    villa = new Villa(temp[0], Double.parseDouble(temp[1]), Double.parseDouble(temp[2]), Integer.parseInt(temp[3]), temp[4], temp[5], Double.parseDouble(temp[6]), Integer.parseInt(temp[7]));
                    facilityList.add(villa);
                } else if (temp.length == 7) {
                    house = new House(temp[0], Double.parseDouble(temp[1]), Double.parseDouble(temp[2]), Integer.parseInt(temp[3]), temp[4], temp[5], Integer.parseInt(temp[6]));
                    facilityList.add(house);
                }
                if (temp.length == 6) {
                    room = new Room(temp[0], Double.parseDouble(temp[1]), Double.parseDouble(temp[2]), Integer.parseInt(temp[3]), temp[4], temp[5]);
                    facilityList.add(room);
                }
            }
            bufferedReaderFaci.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Facility facility : facilityList) {
            System.out.println(facility);
        }
        return facilityList;
    }
}
