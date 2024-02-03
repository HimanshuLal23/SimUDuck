import properties.FlyingBehaviour;
import properties.FlyingDuck;
import properties.SqueakBehaviour;

public class WoodenDuck extends Duck{
    private String eyeColor;
    private FlyingBehaviour flyingBehaviour;
    private SqueakBehaviour squeakBehaviour;
    public WoodenDuck(String eyeColor, FlyingBehaviour flyingBehaviour, SqueakBehaviour squeakBehaviour) {
        super(flyingBehaviour,squeakBehaviour,eyeColor);
    }
}
