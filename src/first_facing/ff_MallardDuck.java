package first_facing;

public class ff_MallardDuck extends ff_Duck {
    private String mMsg = "a mallard duck";

    public void display() {

        super.display(mMsg);

    }

    @Override
    public void quack() {
        super.quack();
    }
}
