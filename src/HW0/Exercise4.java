package HW0;

public class Exercise4 {
    public static void windowPosSum(int[] a, int n) {
        /** your code here */
        for (int indexInArray = 0; indexInArray < a.length; indexInArray += 1) {
            if (a[indexInArray] > 0) {
                int sum = 0;

                for (int currentIndex = indexInArray; currentIndex < Math.min(a.length, indexInArray + n + 1); currentIndex += 1) {
                    sum += a[currentIndex];
                }
                a[indexInArray] = sum;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, -3, 4, 5, 4};
        int n = 3;
        windowPosSum(a, n);

        // Should print 4, 8, -3, 13, 9, 4
        System.out.println(java.util.Arrays.toString(a));
    }
}
