import java.util.Scanner;

public class Two {

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

System.out.print("�� (x,y)�� ��ǥ�� �Է��ϼ���  >> ");

String a = scanner.next();

String b = scanner.next();

int x = Integer.parseInt(a);

int y = Integer.parseInt(b);

if(x>=50 && y>=50 && x<=100 && y<=100)
	System.out.println("��("+x+","+y+")�� (50,50)�� (100,100)�� �簢�� ���� �ֽ��ϴ�");
else
	System.out.println("��("+x+","+y+")�� (50,50)�� (100,100)�� �簢�� ���� �����ϴ�");

scanner.close();

}

}