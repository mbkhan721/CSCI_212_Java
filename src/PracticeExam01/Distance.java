package PracticeExam01;

public class Distance {
    // class variables
    private static final int INCHES_IN_A_FOOT = 12;
    private static final float FEET_IN_A_METER = 0.3048f;

    // instance variables
    int feet, inches;

    public Distance() {
        feet = 0;
        inches = 0;
    }
    public Distance(int f, int i) {
        if (f < 0 || i < 0) {
            throw new IllegalArgumentException("Input must be positive");
        }
        if (i > 11) {
            throw new IllegalArgumentException("Inches must be <= than 11");
        }
        feet = f;
        inches = i;
    }

    public int getFeet() {
        return feet;
    }
    public int getInches() {
        return inches;
    }
    public void setFeet(int feet) {
        this.feet = feet;
    }
    public void setInches(int inches) {
        this.inches = inches;
    }

    public void add(Distance d) {
        inches += d.getInches();
        feet += d.getFeet() + inches / INCHES_IN_A_FOOT;
        inches %= INCHES_IN_A_FOOT;
    }
    public float metricDistance() {
        float totalFeet = (float)this.feet + (float)this.inches/INCHES_IN_A_FOOT;
        return totalFeet * FEET_IN_A_METER;
    }

    public static void main(String[] args) {
        Distance w1 = new Distance(4,9);
        System.out.println(w1.metricDistance());
        Distance w2 = new Distance (3,6);
        w1.add(w2);

        System.out.println(w1.getFeet() + "' " + w1.getInches() + "\"");
        //System.out.println(w1.metricDistance());

    }
}
