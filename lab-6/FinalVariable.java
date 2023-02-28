public class FinalVariable {
    public static void main(String[] args) {
        final int MAX_SIZE = 10;
        System.out.println("Maximum size: " + MAX_SIZE);

        // Uncommenting the following line will result in a compilation error
        // MAX_SIZE = 20;

        final String MESSAGE = "Hello, World!";
        System.out.println("Message: " + MESSAGE);

        // Uncommenting the following line will result in a compilation error
        // MESSAGE = "Goodbye, World!";
    }
}
