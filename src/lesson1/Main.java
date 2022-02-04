package lesson1;

public class Main {
    public static void main(String[] args) {

        Member[] members = {
                new Robot(10, 12),
                new Cat(10, 11),
                new Person(10, 10),

        };
        let[] lets = {
                new Wall(10),
                new Treadmill(10)
        };
        for (Member e : members) {
            for (let l :lets) {
                if(!l.can(e)){
                    continue;
                }
            }
        }
    }
}
