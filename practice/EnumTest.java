public class EnumTest {
	public static void main(String[] args) {
		
		Color c1 = Color.BLACK;
		System.out.println(c1);
		c1.colorInfo();

	}	

}

enum Color {
	RED,
	BLACK,
	WHITE;

	/**
	 *
	 */
	private Color (){
		System.out.println("hello"+ this.toString());
	} 

	public void colorInfo(){
		System.out.println("this is method within enum");
	}
}
