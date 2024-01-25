package examples;

abstract class X {
    public X() {
        System.out.print("DOG");
    }

    abstract void abstractMethod();
}

class Y extends X {
    public Y() {
        super();
        System.out.print("CAT");
    }

    @Override
    void abstractMethod() {
        System.out.print("COW");
    }
}

public class Example3 {
    public static void main(String[] args) {
        X x = new Y();
        x.abstractMethod();
    }
}
