package classes.lecture2;

/**
 * Does a test run of the Dog class
 */
public class DogLauncher {
    public static void main(String[] args) {
        Dog largeDog = new Dog(1000000);
        largeDog.makeNoise();

        Dog smallDog = new Dog(-5);
        smallDog.makeNoise();

        Dog[] dogs = new Dog[2];
        dogs[0] = new Dog(8);
        dogs[1] = new Dog(20);
        dogs[0].makeNoise();

        Dog bigger = Dog.maxDog(largeDog, smallDog);
        bigger.makeNoise();

        largeDog.maxDog(smallDog).makeNoise();
    }
}
