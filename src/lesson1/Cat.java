package lesson1;


public class Cat implements Runnable, Jumpable{
    @Override
    public void run() {
        System.out.println("Cat run");
    }

    @Override
    public void jump() {
        System.out.println("Cat jump");
    }
}


