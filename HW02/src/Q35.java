
public class Q35 {

	public static void main(String[] fruits) {
		String fruit1 = new String("apple");
		String fruit2 = new String("orange");
		String fruit3 = new String("pear");
		fruit3 = fruit1;
		fruit2 = fruit3;  // fruit 2 and fruit 3 going to go garbage collection.
		fruit1 = fruit2;
		}
}
