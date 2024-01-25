package examples;

abstract class TestAbstract {
    String my_name;

    String myName() {
        my_name = "Beyonce";
        return my_name;
    }

    abstract void display();
}

public class Example2 extends TestAbstract {
    void display() {
        String n = myName();
        System.out.print("My name is " + n);
    }

    public static void main(String args[]) {
        Example2 t = new Example2();
        t.display();
    }
}
