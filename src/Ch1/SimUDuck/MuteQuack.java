package Ch1.SimUDuck;

public class MuteQuack implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("<< Im lặng... >>");
    }
}
