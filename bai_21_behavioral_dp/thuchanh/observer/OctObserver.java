package bai_21_behavioral_dp.thuchanh.observer;

public class OctObserver extends Observer{
    public OctObserver(Subject subject) {
        this.subject = subject;
        this.subject.add( this );
    }

    @Override
    public void update() {
        System.out.print(" " + Integer.toBinaryString(subject.getState()));
    }
}
