package lesson1;

public class Treadmill implements let{

    private int dist;

    public Treadmill(int dist) {
        this.dist = dist;
    }

    @Override
    public boolean can(Member e) {
        return e.run(dist);
    }
}