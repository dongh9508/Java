import java.util.Scanner;

public class one {

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

System.out.print("두 정수를 입력하세요 >> ");

String a = scanner.next();

String b = scanner.next();

int x = Integer.parseInt(a);

int y = Integer.parseInt(b);

int sum;
sum = x + y;


System.out.println(x+" + "+y+" 은 " + sum);

scanner.close();

}

}