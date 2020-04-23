
public class Q02 {

	public static void main(String[] args) {
		Gold gold = new Gold();
		Silver gumus = new Silver(); 
		
	}

}

class Metal {
	String weight;
	String color;
}

class Gold extends Metal {
	String hue;
}

class Silver extends Metal {
	String luster;
}
