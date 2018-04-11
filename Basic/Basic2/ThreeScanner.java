import java.util.Scanner;

public class ThreeScanner {

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

System.out.print("논리 연산을 입력하세요>>");

boolean a = scanner.nextBoolean();

String ab = scanner.next();

boolean b = scanner.nextBoolean();

switch(ab){

case "AND" :

if(a == true && b == true)

System.out.println("true");

else System.out.println("false");

break;

case "OR" :

if(a == true || b == true)

System.out.println("true");

else System.out.println("false");

break;

}

            scanner.close();

}

}