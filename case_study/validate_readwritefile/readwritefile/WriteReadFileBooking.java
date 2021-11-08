package case_study.validate_readwritefile.readwritefile;

import case_study.models.Booking;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteReadFileBooking {
    public static final String BOOKING = "D:\\Inteillj_idea\\Module__2\\src\\case_study\\data\\booking.csv";

    public static void writeBooking(Booking booking, String path) {
        try {
            FileWriter fileWriter = new FileWriter(path, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(booking.toString());
            bufferedWriter.newLine();
            bufferedWriter.close();
            System.out.println("Ghi thành công");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static List<Booking> readBookingFile(String path) {
        List<Booking> bookingList = new ArrayList<>();
        BufferedReader bufferedReader;
        try {
            FileReader fileReader = new FileReader(path);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] temp;
            Booking booking;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                booking = new Booking(Integer.parseInt(temp[0]), temp[1], temp[2], temp[3], temp[4], temp[5]);
                bookingList.add(booking);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Booking booking : bookingList) {
                System.out.println(booking);
            }

        return bookingList;
    }
}
