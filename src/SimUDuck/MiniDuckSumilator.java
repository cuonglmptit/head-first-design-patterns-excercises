package SimUDuck;

public class MiniDuckSumilator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performQuack();
        mallard.performFly();
        System.out.println();

        //Tạo vịt model
        Duck model = new ModelDuck();
        model.display();
        model.performQuack();
        model.performFly();
        // Thay đổi hành vi bay của vịt model
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
