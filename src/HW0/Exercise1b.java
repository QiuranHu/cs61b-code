package HW0;

public class Exercise1b {
    public static void drawTriangle(int N) {
        String stars = "*";
        for (int rowIndex = 0; rowIndex < N; rowIndex += 1) {
            System.out.println(stars);
            stars += "*";
        }
    }

    public static void main(String[] args) {
        drawTriangle(10);
    }
}
