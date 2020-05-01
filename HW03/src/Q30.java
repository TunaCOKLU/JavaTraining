
public class Q30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int x = 10, y = 5;
		boolean w = true, z = false;
		x = w ? y++ : y--;
		w = !z;
		System.out.print((x+y)+" "+(w ? 5 : 10));
		

	}

}
