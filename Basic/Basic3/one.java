import java.util.Scanner;
public class one {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("���ĺ� �� ���ڸ� �Է��ϼ��� >>");
		String s = scanner.next();
		char c = s.charAt(0);
		for(char a='a';a<=c;a++)
		{
			for(char b=a;b<=c;b++)
			System.out.println(b);
			System.out.println();       
		}	
scanner.close();
	}
}
