import java.util.Scanner;

abstract class Three {

	protected int a, b;

	protected void input() {

		Scanner Scanner = new Scanner(System.in);		

		System.out.print("���� 2���� �Է��ϼ���>>");

		a = Scanner.nextInt();

		b = Scanner.nextInt();

	}

	public void run() {

		input();

		int res = calc();

		System.out.println("���� ���� " + res);

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






