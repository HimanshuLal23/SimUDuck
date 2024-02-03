import properties.FlyingBehaviour;
import properties.SqueakBehaviour;

public class Duck {
    private FlyingBehaviour flyingBehaviour;
    private SqueakBehaviour squeakBehaviour;
    private String eyeColor;
    public Duck(FlyingBehaviour flyingBehaviour, SqueakBehaviour squeakBehaviour,String eyeColor) {
        this.eyeColor = eyeColor;
        this.flyingBehaviour = flyingBehaviour;
        this.squeakBehaviour = squeakBehaviour;
    }
    public void printEyeColor() {
        System.out.println(this.eyeColor);
    }
    public void printFlyingBehaviour() {
        this.flyingBehaviour.fly();
    }

    public void printSqueakingBehaviour() {
        this.squeakBehaviour.squeak();
    }
}
