package lesson1;

public class Cat implements Member {
    private int MaxJump;
    private int MaxRun;

    public Cat(int MaxJump, int MaxRun) {
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
            System.out.println("Кот " + " пробежал " + dist + " метров");
            return true;
        } else {
            System.out.println("Кот " + " не смог пробежать " + dist + " метров");
            return false;
        }
    }


        @Override
        public boolean jump(int dist){
            if (getMaxJump() > dist) {
                System.out.println("Кот " + " прыгнул " + dist + " метров");
                return true;
            } else {
                System.out.println("Кот " + " прыгнул " + dist + " метров");
                return false;
            }
        }
    }
