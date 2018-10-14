import java.util.Scanner;

abstract class Three {

	protected int a, b;

	protected void input() {

		Scanner Scanner = new Scanner(System.in);		

		System.out.print("정수 2개를 입력하세요>>");

		a = Scanner.nextInt();

		b = Scanner.nextInt();

	}

	public void run() {

		input();

		int res = calc();

		System.out.println("계산된 값은 " + res);

	}

	abstract protected int calc(); 

}



class Adder extends Three {

	public int calc() {

		return a + b;

	}

}



class Subtracter extends Three {

	public int calc() {

		return a - b;

	}

}



 class Three1 {

	public static void main(String[] args) {

		Adder adder = new Adder();

		Subtracter sub = new Subtracter();

		

		adder.run();

		sub.run();

	}



}






