import java.util.Scanner;
import java.util.Random;
public class OpenChallenge {

	public static void main(String[] args) {
		int a=0, b=0, c=99, i=1;
		Random ran = new Random();
		Scanner scanner = new Scanner(System.in);
		int r=ran.nextInt(99)+0;
		System.out.println("수를 결정하였습니다. 맞추어보세요.");
		do {
			System.out.println(b+"-"+c);
			System.out.print(i+">>");
			a = scanner.nextInt();
			if(a>r)
			{
				c = a;
				System.out.println("더 낮게");
				i++;
			}
			else if(a == r)
			{
				System.out.println("맞았습니다.");
				System.out.println("계속하시겠습니까(y/n)>>");
				String yn = scanner.next();
				if(yn.equals("y"))
				{
					r = ran.nextInt(99)+0;
					c = 99;
					b = 0;
					i = 1;
					System.out.println("수를 결정하였습니다. 맞추어 보세요.");
				}
				else if(yn.equals("n"))
				{
					System.exit(0);
				}
				
			}
		}
		while(r!=a);
		scanner.close();
		

	}

}
