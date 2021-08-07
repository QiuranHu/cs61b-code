package classes.lecture2;

public class ArgsSum {
    /**
     * Print the sum of command line arguments.
     */
    public static void main(String... args) {
        int i = 0;
        int sum = 0;
        while (i < args.length) {
            sum = sum + Integer.parseInt(args[i]);
            i += 1;
        }
        System.out.println(sum);
    }
}
