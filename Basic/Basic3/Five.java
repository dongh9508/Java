import java.util.Scanner;
public class Five {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int Array[] = new int [10];
		System.out.println("���� 10�� �Է� >>");
		for(int i=0; i<Array.length; i++)
			Array[i] = scanner.nextInt();
		
		int x;
		for(int i=0; i<Array.length; i++)
		{
			x = i;
			for(int j=i; j<Array.length; j++)
				if(Array[x] > Array[j])
					x = j;
			int tmp = Array[i];
			Array[i] = Array[x];
			Array[x] = tmp;
		}
		for(int i=0; i<Array.length; i++)
			System.out.println(Array[i]+" ");
		
		scanner.close();
		
		}
		
		

	}


