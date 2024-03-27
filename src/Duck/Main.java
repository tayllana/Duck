package Duck;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck mallard = new MallardDuck();

		 mallard.display();
		 mallard.performQuack();
		 mallard.performFly();
		 mallard.setFlyBehavior(new FlyNoWay());
		 mallard.setQuackBehavior(new MuteQuack());
		 mallard.display();
		 mallard.performFly();
		 mallard.performQuack();

		 Duck rubber = new RubberDuck();
		 rubber.display();
		 rubber.performFly();
		 rubber.performQuack();
	}

}