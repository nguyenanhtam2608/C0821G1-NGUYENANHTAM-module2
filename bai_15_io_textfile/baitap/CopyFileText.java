package bai_15_io_textfile.baitap;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileText {

    public static final String READ_FILE = "D:\\Inteillj_idea\\Module__2\\src\\io_textfile\\baitap\\sourcefile.txt";
    public static final String TARGET_FILE = "D:\\Inteillj_idea\\Module__2\\src\\io_textfile\\baitap\\targetfile.txt";


    //b1 :đọc Nội dung của file soucre
    // FileReader dùng để đọc tệp
    public static String reafFile(FileReader fileReader) throws IOException {
        int i = 0;
        String result = "";
        while ((i = fileReader.read()) != -1) {// chạy hết chuỗi đến phần tử tử null thì stop
//            result += i;// sẽ cho ra mã ASCII, chúng ta sẽ ép kiểu sáng char để hiển thị nội dung đó
            result += (char) i;
        }
        fileReader.close();
        return result;
    }


    //b2 Ghi nội dung đã được đoc cào file new(targetFile)
    public static void writeFile(FileWriter fileWriter, String writeContent) {
        try {
            fileWriter.write(writeContent);
            fileWriter.close();
            System.out.println("Write success!!!");
        } catch (IOException e) {
            System.err.println("Không đọc được File");
        }
    }

    public static void main(String[] args) throws IOException {
        String result = "";
        try {
            result = reafFile(new FileReader(READ_FILE));
            System.out.println(result);
        } catch (IOException e) {
            System.err.println("Lỗi!!!!!");
        }
        writeFile(new FileWriter(TARGET_FILE), result);
    }
}
