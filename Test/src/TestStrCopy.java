
public class TestStr {

	static int count;
	static {
		count=0;
	}
	
	// main method for this class
	public static void main(String[] args) {
		String s = "hello";
		String t = s.concat("world");
		
		System.out.println(t);
		TestStr.count=10;
		
		int a[][] = new int[3][];
		
		a[0] = new int[3];
	}

}
