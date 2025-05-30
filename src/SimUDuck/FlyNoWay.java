package SimUDuck;

public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("Tao không bay được 😠");
    }
}
