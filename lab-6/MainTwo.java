public final class FinalClass {
    private int value;

    public FinalClass(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

// Uncommenting the following line will result in a compilation error
// class SubClass extends FinalClass {}

public class MainTwo {
    public static void main(String[] args) {
        FinalClass finalClass = new FinalClass(42);
        System.out.println("Value: " + finalClass.getValue());
    }
}

