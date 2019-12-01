public class TurkeyAdapter implements Duck {
	Turkey turkey;

	public TurkeyAdapter(Turkey newTurkey){
		turkey = newTurkey;
	}

	@Override
	public void quack() {
		turkey.gobble();
	}

	@Override
	public void fly() {
		turkey.turkeyFly();
	}
}
