import java.util.Scanner;
public class Four {

	private String name, tel;
	public Four(String name, String tel) {
	   this.name = name;
	   this.tel = tel;
	}
	public String getName() {return name;}
	public String getTel() {return tel;}

	public static void main(String[] args) {
		
		System.out.print("인원수 >> ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Four[] phone = new Four[n];

		for (int i = 0; i < n; i++) {
			System.out.print("이름과 전화번호(번호는 연속적으로 입력) >> ");
			phone[i] = new Four(scanner.next(), scanner.next());
		}
		System.out.println("저장되었습니다");
		
		while (true) {
			System.out.print("검색할 이름 >> ");
			String string = scanner.next();
			if (string.equals("exit"))
				break; 
			for (int i = 0; i < n; i++) {
			if (string.equals(phone[i].name)) {
			System.out.println(string + "의 번호는 " + phone[i].tel + "입니다.");
			break;
			}
			if(i==n-1)
			System.out.println(string + "이 없습니다. ");	
			}
		}
		scanner.close();
	}
}



		
	
         

