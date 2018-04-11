import java.util.InputMismatchException;
import java.util.Scanner;
public class Four {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		char day[]={'일','월','화','수','목','금','토'};
		while(true)
		{
			try
			{
		
		System.out.println("정수를 입력하세요.>>");
	    int n = scanner.nextInt();
	    
	    if(n>=0)
	    	System.out.println(day[n%7]);
	    else
	    {
	    	System.out.println("프로그램을 종료합니다..");
	    	scanner.close();
	    	System.exit(0);
	    }
	    }
			catch (InputMismatchException e)
			{
				System.out.println("프로그램을 종료합니다...");
				System.exit(0);
				
			}

		}
		}
}
		
