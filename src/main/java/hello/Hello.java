package hello;

public class Hello {
    public static void main(String[] args) {
        new Thread(() -> System.out.println("Hello World")).start();
    }
}
