interface Two{

	int add(int x, int y);

	int add(int n);

}

 class Two1 implements Two{

	public int add(int x,int y){

		return x+y;

	}

	public int add(int n) {


		int sum = 0;

		for(int i=0; i <=n;i++)

			sum +=i;

		return sum;

	}

	public static void main(String[] args){

		Two1 adder = new Two1();

		System.out.println(adder.add(5,10));

		System.out.println(adder.add(10));

	}

}

