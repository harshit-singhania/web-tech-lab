// display use of final function

public class SixPartThree {
    public final void display() {
        System.out.println("final function");
    }
}

class Main extends SixPartThree {
    // try to override final method
    public final void display() {
      System.out.println("The final method is overridden.");
    }
  
    public static void main(String[] args) {
      Main obj = new Main();
      obj.display();
    }
  }
