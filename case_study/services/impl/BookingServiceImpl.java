package case_study.services.impl;

import case_study.models.Booking;
import case_study.services.BookingService;
import case_study.validate_readwritefile.readwritefile.WriteReadFileBooking;
import case_study.validate_readwritefile.validate.BookingComparator;
import case_study.validate_readwritefile.validate.ValidateBooking;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class BookingServiceImpl  implements BookingService {
   Set<Booking> bookingSet ;

    public BookingServiceImpl() {
        bookingSet = new TreeSet<>(new BookingComparator());// class Booking Comparator override compare (sắp xếp theo id Booking)
                                                            // nếu trùng id chỉ hiển thị 1 Booking
    }

    public BookingServiceImpl(Set<Booking> bookingSet) {
        this.bookingSet = (TreeSet<Booking>) bookingSet;
    }

    public Set<Booking> getBookingSet() {
        return bookingSet;
    }

    public void setBookingSet(Set<Booking> bookingSet) {
        this.bookingSet = (TreeSet<Booking>) bookingSet;
    }

    Scanner input = new Scanner(System.in);

    @Override
    public void disPlay() {
        Booking booking1 = new Booking(1,"26/08/2021","27/08/2021","1","Villa","Xông hơi");
        Booking booking2 = new Booking(2,"26/08/2021","27/08/2021","1","Villa","Xông hơi");
        bookingSet.add(booking1);
        bookingSet.add(booking2);
        for( Booking booking3 :bookingSet){
            System.out.println(booking3);
        }



    }

    @Override
    public void add() {
        int idBooking = ValidateBooking.idBooking();
        String startDay = ValidateBooking.startDay();
        String endDay = ValidateBooking.endDay();
        String idCus = ValidateBooking.idCus();
        String nameSercive = ValidateBooking.nameSercive();
        System.out.println("Nhập loại dịch vụ");
        String serciveType = input.nextLine();
        Booking booking = new Booking(idBooking,startDay,endDay,idCus,nameSercive,serciveType);
        bookingSet.add(booking);
        for( Booking booking2 :bookingSet){
            System.out.println(booking2);
        }
        WriteReadFileBooking.writeBooking(booking,WriteReadFileBooking.BOOKING);


    }

    @Override
    public void edit() {
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

    @Override
    public void displayListContracts() {


    }

    @Override
    public void createNewConstracts() {



    }

    @Override
    public void editcontracts() {

    }


}
