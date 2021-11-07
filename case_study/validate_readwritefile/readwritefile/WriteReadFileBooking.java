package case_study.validate_readwritefile.readwritefile;

import case_study.models.Booking;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteReadFileBooking {
    public static final String BOOKING = "D:\\Inteillj_idea\\Module__2\\src\\case_study\\data\\booking.csv";
    public static void writeBooking(Booking booking,String path){
        try {
            FileWriter fileWriter = new FileWriter(path,true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(booking.toString());
            bufferedWriter.newLine();
            bufferedWriter.close();
            System.out.println("Ghi thành công");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
