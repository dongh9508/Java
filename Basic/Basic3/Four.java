import java.util.InputMismatchException;
import java.util.Scanner;
public class Four {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		char day[]={'��','��','ȭ','��','��','��','��'};
		while(true)
		{
			try
			{
		
		System.out.println("������ �Է��ϼ���.>>");
	    int n = scanner.nextInt();
	    
	    if(n>=0)
	    	System.out.println(day[n%7]);
	    else
	    {
	    	System.out.println("���α׷��� �����մϴ�..");
	    	scanner.close();
	    	System.exit(0);
	    }
	    }
			catch (InputMismatchException e)
			{
				System.out.println("���α׷��� �����մϴ�...");
				System.exit(0);
				
			}

		}
		}
}
		
