package HW0;

public class Exercise1a {
    public static void main(String[] args) {
        int totalRowCount = 5;
        String stars = "*";
        for (int rowIndex = 0; rowIndex < totalRowCount; rowIndex += 1) {
            System.out.println(stars);
            stars += "*";

        }
    }
}
