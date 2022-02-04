package lesson1;

public class Wall implements let {

    private int Height;

    public Wall(int height) {
        this.Height = height;
    }
    @Override
    public boolean can(Member e) {
        return e.jump(Height);
    }
}