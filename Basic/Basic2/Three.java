public class Three {
	public static void main(String[] argv){
	
		switch(argv[1]){
	
		case "AND" :

			if(argv[0].equals("true") && argv[2].equals("true"))

			System.out.println("true");

			else System.out.println("false");

			break;

			case "OR" :

			if(argv[0].equals("true") || argv[2].equals("true"))

			System.out.println("true");

			else System.out.println("false");

			break;

			}
	}
}