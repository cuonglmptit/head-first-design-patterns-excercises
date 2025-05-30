package SimUDuck;

public class MallardDuck extends Duck{
    @Override
    public void display() {
        System.out.println("Tao là vịt cổ xanh Mallard đây 🦆!");
    }

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }


}


