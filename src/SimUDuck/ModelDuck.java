package SimUDuck;

public class ModelDuck extends Duck{
    @Override
    public void display() {
        System.out.println("Tao là vịt model đây!");
    }

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }
}
