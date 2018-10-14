import java.util.Scanner;
public class Three {

	private int width, height;
	public Three(int width, int heigth) {
		this.width = width;
		this.height = heigth;
	}
	public int getArea() { return width*height; }
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Three [] r = new Three[4]; 
		
		for(int i=0; i<r.length; i++) {
			System.out.print(i+1);
			System.out.print(" 너비와 높이 >>");
			int width = scanner.nextInt();
			int height = scanner.nextInt();
			r[i] = new Three(width, height);
		}
		
		System.out.println("저장하였습니다...");
		int sum = 0;
		for(int i=0; i<r.length; i++) 
			sum += r[i].getArea();

		System.out.println("사각형의 전체 합은 " + sum);
	}

}




