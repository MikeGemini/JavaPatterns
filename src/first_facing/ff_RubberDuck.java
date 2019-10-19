package first_facing;

public class ff_RubberDuck extends ff_Duck {

    private String mMsg = "a rubber duck";

    @Override
    public void fly() {
        super.fly();
    }

    public void display() {
        super.display(mMsg);
    }
}
