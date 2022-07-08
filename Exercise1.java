
class mainExercise1 {
	int a;
	float b;
	String str;

	public void operation1() {
		a = 10;
		b = 15.26f;
		str = "Java";
	}

	public void operation2() {
		a = 20;
		b = 27f;
		str = "SELENIUM";
	}
	
	public void operation3() {
		a = 10;
		b = 15.26f;
		str = "saleforce";
	}

	public void operation4() {
		a = 20;
		b = 27f;
		str = "AWS";
	}


	public void display() {
		System.out.println("The Integer Value is :" + a);
		System.out.println("Thw Float Value is :" + b);
		System.out.println("The String Value is :" + str);
	}
}

public class Exercise1 {
	public static void main(String[] args) {
		mainExercise1 obj = new mainExercise1();
		System.out.println("**********************");
		obj.operation1();
		obj.display();
		System.out.println("==========================");
		obj.operation2();
		obj.display();
		System.out.println("==========================");
		obj.operation3();
		obj.display();
		System.out.println("==========================");
		obj.operation4();
		obj.display();

		System.out.println("**********************");
	}
}