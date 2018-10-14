
public class Six {

	public static void main(String[] argv) {
		
		int x,y;
		
		int i = 0;
		
		int n = Integer.parseInt(argv[0]);
		
		x = n / 10; 
		
		y = n % 10;
		
		if(x == 3 || x == 6 || x == 9) i++;
		
		if(y == 3 || y == 6 || y == 9) i++;
		
		if(i == 2) 
		    System.out.println("¹Ú¼öÂ¦Â¦");
		
		else if(i == 1) 
			System.out.println("¹Ú¼öÂ¦");
		
		else if(i == 0) 
			System.out.println("¹Ú¼ö¾øÀ½");	

	}

}
