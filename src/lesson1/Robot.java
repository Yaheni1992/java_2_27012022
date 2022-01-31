package lesson1;

public class Robot implements Runnable, Jumpable{
    @Override
    public void run() {
        System.out.println("Robot run");
    }


    @Override
    public void jump() {
        System.out.println("Robot jump");
    }
}


