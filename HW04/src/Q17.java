import java.util.Arrays;

public class Q17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] os = new String[] { "Mac", "Linux", "Windows" };
		Arrays.sort(os);
		System.out.println(Arrays.binarySearch(os, "Mac"));
		
		
	}

}
