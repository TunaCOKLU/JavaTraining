import java.time.LocalDate;

public class Q32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate xmas = LocalDate.of(2016, 12, 25);
		xmas.plusDays(-1);
		System.out.println(xmas.getDayOfMonth());

	}

}
