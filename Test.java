public class Test {
    // A static integer variable x initialized with the value 4
    private static int x = 4;

    // The main method - the entry point of the Java program
    public static void main(String[] args) {
        // Prints the value of x using print() with manual newline character (\n)
        System.out.print("X value is: " + x + ".\n");

        // Prints the value of x using println(), which automatically moves to a new line
        System.out.println("X value is: " + x + ".");

        // Prints the value of x using printf() with a formatted string
        System.out.printf("X value is: %d.\n", x);
    }
}
