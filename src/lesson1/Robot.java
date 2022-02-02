package lesson1;

public class Robot implements Member {
    private int MaxJump;
    private int MaxRun;

    public Robot(int MaxJump, int MaxRun) {
        this.MaxJump = MaxJump;
        this.MaxRun = MaxRun;
    }

    public int getMaxJump() {
        return MaxJump;
    }

    public int getMaxRun() {
        return MaxRun;
    }


    @Override
    public boolean run(int dist) {
        if (getMaxRun() > dist) {
            System.out.println("Робот " + " пробежал " + dist + " метров");
            return true;
        } else {
            System.out.println("Робот " + " не смог пробежать " + dist + " метров");
            return false;
        }
    }

    @Override
    public boolean jump(int dist){
        if (getMaxJump() > dist) {
            System.out.println("Робот " + " прыгнул " + dist + " метров");
            return true;
        } else {
            System.out.println("Робот " + " прыгнул " + dist + " метров");
            return false;
        }
    }
}


