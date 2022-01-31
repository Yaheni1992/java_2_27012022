package lesson1;

public class Person implements Runnable, Jumpable{
    @Override
    public void run() {
        System.out.println("Person run");
    }

    @Override
    public void jump() {
        System.out.println("Person jump");
    }
}