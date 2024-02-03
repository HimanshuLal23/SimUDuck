package properties;

import properties.FlyingBehaviour;

public class FlyingDuck implements FlyingBehaviour {
    @Override
    public void fly() {
        System.out.println("I am flying");
    }
}
