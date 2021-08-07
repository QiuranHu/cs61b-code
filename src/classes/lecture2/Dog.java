package classes.lecture2;

public class Dog {
    /** Size of dog in standard imperial dog units. */
    public int size;

    public static String binomen = "Canis familiaris";

    /** Constructor for dogs using an integer. */
    public Dog (int s) {
        size = s;
    }

    public void makeNoise() {
        if(size < 10) {
            System.out.println("yip!");
        } else if(size < 30) {
            System.out.println("bark ");
        } else {
            System.out.println("arooooo.");
        }
    }

    /** Returns the larger dog. */
    public static Dog maxDog(Dog d1, Dog d2) {
        if(d1.size > d2.size) {
            return d1;
        }
        return d2;
    }

    /** Compares ME and another dog. */
    public Dog maxDog(Dog otherDog) {
        if(this.size > otherDog.size) {
            return this;
        }
        return otherDog;
    }
}
