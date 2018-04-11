import java.util.Scanner;
public class Two {

	private String name, tel;
	private static Scanner scanner;
	public Two(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	public String getName() { return name; }
	public String getTel() { return tel; }
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름과 전화번호 입력 >>  ");
		Two a = new Two(scanner.next(), scanner.next());
		System.out.println("이름과 전화번호 입력 >>  ");
		Two b = new Two(scanner.next(), scanner.next());
		
		System.out.println( a.getName() + " 의 번호 " + a.getTel() );
		System.out.println( b.getName() + " 의 번호 " + b.getTel() );
		scanner.close();
		
		
		
	}

}
