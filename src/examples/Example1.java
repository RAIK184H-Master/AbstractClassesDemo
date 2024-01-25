package examples;

abstract class MyClass { // line 1
    private int a, b;

    public void call(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.print(a + b);
    }
}

public class Example1 {
    public static void main(String args[]) {
        MyClass m = new MyClass(); // line 2
        m.call(12, 25);
    }
}
