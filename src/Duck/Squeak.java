package Duck;

public class Squeak implements QuackBehavior {
	@Override
	public void quack() {
		System.out.println("Squeack");
	}

}