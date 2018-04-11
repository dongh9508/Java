
public class FacRec {

	public static void main(String[] args) {
		System.out.println ("fac(" + 4 + ") is " + fac(4));
	}
	private static int fac (int n) {
	if (n <= 1) return 1;
	else return n * fac(n-1);
	}

	}


