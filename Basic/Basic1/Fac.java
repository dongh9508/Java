
public class Fac {
	
public static void main (String[] argv) {
	int n = Integer.parseInt(argv[0]);
	System.out.println ("fac("+ n +") is "+fac(n));
}
     private static int fac(int n) {
     return (n<=1)?1:n*fac(n-1);
}
}
