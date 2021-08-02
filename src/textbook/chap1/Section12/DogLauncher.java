package textbook.chap1.Section12;

public class DogLauncher {
    public static void main(String[] args) {
        Dog d = new Dog(25);
        Dog d2 = new Dog(100);
        Dog bigger = Dog.maxDog(d, d2);
        bigger.makeNoise();
        Dog bigger2 = d.maxDog(d2);
        d.makeNoise();
        System.out.println(d.binomen);
    }
}
