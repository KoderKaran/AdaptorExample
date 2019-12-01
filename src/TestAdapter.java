public class TestAdapter {
	public static void main(String[] args){
		System.out.println("The duck says:");
		MallardDuck duck = new MallardDuck();
		duck.fly();
		duck.quack();
		System.out.println("\nThe not duck says:");
		Turkey turkey = new Turkey();
		TurkeyAdapter notADuck = new TurkeyAdapter(turkey);
		notADuck.fly();
		notADuck.quack();
	}
}
