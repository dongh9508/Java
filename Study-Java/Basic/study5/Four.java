
class Four{

	private int x,y;

	public Four(int x, int y){this.x = x; this.y=y;}

	public int getX(){return x;}

	public int getY(){return y;}

	protected void move(int x, int y){ this.x =x; this.y=y;}

}

 class Four1 extends Four {

	private String color;

	Four1(int x, int y, String color) {

		super(x, y);

		this.color =color;

	}

	void setPoint(int x, int y) {

		move(x, y);

	}

	void setColor(String color) { this.color = color; }

	void show() {

		System.out.println(color + "»öÀ¸·Î" + "(" + getX() + "," + getY() + ")");

	}

	public static void main(String[] args) {

		Four1 cp = new Four1(5, 5,"YELLOW");

		cp.setPoint(10, 20);

		cp.setColor("GREEN");

		cp.show();



	}

}



