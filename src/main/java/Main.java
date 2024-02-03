import properties.FlyingDuck;
import properties.MovingDuck;
import properties.SlientDuck;
import properties.SqueakingDuck;
public class Main {
    public static void main(String []args) {
        Duck mallardDuck = new MallardDuck("Brown Eyes",new FlyingDuck(),new SqueakingDuck());
        mallardDuck.printFlyingBehaviour();
        mallardDuck.printSqueakingBehaviour();
        mallardDuck.printEyeColor();

        System.out.println();
        Duck woodenDuck = new WoodenDuck("Black Eyes",new MovingDuck(),new SlientDuck());
        woodenDuck.printFlyingBehaviour();
        woodenDuck.printSqueakingBehaviour();
        woodenDuck.printEyeColor();
    }
}
