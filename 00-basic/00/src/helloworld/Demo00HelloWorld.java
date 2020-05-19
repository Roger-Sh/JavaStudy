package helloworld;

public class Demo00HelloWorld {
    // static method can be called without instance
    // main method from a class is like a main function
    // a java program can be called with different main method
    public static void main(String[] args) {
        System.out.println("Hello World\n");
        SecondHelloWorld.main();
    }

}

// one package only has one puclic class, other class can be called from the public class
class SecondHelloWorld {
    public static void main() {
        System.out.println("Hello World from SecondHelloWorld\n");
    }
}
