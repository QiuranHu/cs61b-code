package HW0;

public class Exercise3 {
    public static int max(int[] m) {
        if (m.length == 0) {
            throw new Error("Nothing to return");
        }
        int max = m[0];

        for (int index = 1; index < m.length; index += 1) {
            if (m[index] > max) {
                max = m[index];
            }
        }
        System.out.println(max);
        return max;
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
        max(numbers);
    }
}
