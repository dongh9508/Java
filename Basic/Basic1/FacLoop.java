public class FacLoop {
public static void main(String argv[]) {
int i;
int n = 4; 
int fac = 1;
for (i = n; i >= 1; i--)
fac = fac * i;
System.out.println ("fac(" + n + ") is " + fac);
}
}