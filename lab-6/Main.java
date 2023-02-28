public class FinalMethod {
    public final void printMessage() {
        System.out.println("Hello, World!");
    }
}

class SubClass extends FinalMethod {
    // Uncommenting the following method will result in a compilation error
    // public void printMessage() {
    //     System.out.println("Goodbye, World!");
    // }
}

public class Main {
    public static void main(String[] args) {
        FinalMethod finalMethod = new FinalMethod();
        finalMethod.printMessage();

        SubClass subClass = new SubClass();
        subClass.printMessage();
    }
}

