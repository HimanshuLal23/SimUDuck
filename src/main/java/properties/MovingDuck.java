package properties;

import properties.FlyingBehaviour;

public class MovingDuck implements FlyingBehaviour {
    @Override
    public void fly() {
        System.out.println("I don't fly, I just keep movin HAHA!!");
    }
}
