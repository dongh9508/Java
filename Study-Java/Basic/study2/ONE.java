
public class ONE {

	private String title;
	public ONE(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	
	public static void main(String[] args) {
		ONE mysong = new ONE("Let it go");
		ONE yoursong = new ONE("강남스타일");
		System.out.println("내 노래는 " + mysong.getTitle());
		System.out.println("너 노래는 " + yoursong.getTitle());
		

	}

}
