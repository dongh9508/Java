import java.util.Scanner;
public class Two {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A[] = new int[10];
		System.out.println("정수 10개를 입력 >>");
		for(int i=0; i<A.length; i++)
		{
			A[i] = scanner.nextInt();
		if(A[i]%3 == 0)
			System.out.println(A[i] + " ");
	}
		System.out.println();
		scanner.close();
}
	
}
