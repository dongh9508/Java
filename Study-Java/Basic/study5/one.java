
	public class one {
		 
		private int radius;
		public one(int radius){this.radius = radius;}
		public int getRadius(){return radius;} 
	}
	
class one1 extends one {
	private String name = "";
	 one1(int radius, String name)
	 {
	  super(radius);
	  this.name = name;
	 }
	 public void show()
	 {
	  System.out.print(this.name + ", ¹ÝÁö¸§ = " + getRadius());
	 }
	public static void main(String[] args)
	 {
	  one1 w = new one1(5, "Waffle");
	  w.show();
	 }
	}

