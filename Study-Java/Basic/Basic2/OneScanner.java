import java.util.Scanner;

public class OneScanner {

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

System.out.print("�� ������ �Է��ϼ��� >> ");

int a = scanner.nextInt();

int b = scanner.nextInt();

int sum;
sum = a + b;


System.out.println(a+" + "+b+" �� " + sum);

scanner.close();

}

}