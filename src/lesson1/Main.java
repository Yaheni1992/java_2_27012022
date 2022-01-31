package lesson1;

public class Main {
    public static void main(String[] args) {
        Runnable[] runnables = new Runnable[]{
                new Cat(),
                new Person(),
                new Robot()
        };
        for (int i = 0; i < runnables.length; i++) {
            runnables[i].run();
        }
        Jumpable[] jumpables = new Jumpable[]{
                new Cat(),
                new Person(),
                new Robot()
        };
        for (int i = 0; i < jumpables.length; i++) {
            jumpables[i].jump();
        }
    }
}