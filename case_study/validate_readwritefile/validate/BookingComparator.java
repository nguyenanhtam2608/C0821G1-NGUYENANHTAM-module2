package case_study.validate_readwritefile.validate;

import case_study.models.Booking;

import java.util.Comparator;

public class BookingComparator implements Comparator<Booking>{


    @Override
    public int hashCode() {
        return super.hashCode();
    }


    @Override
    public int compare(Booking o1, Booking o2) {
        return o1.getIdBooking() - o2.getIdBooking();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }


}
