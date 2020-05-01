
public class Q09 {
public void calculateResult(Integer candidateA, Integer candidateB) {
boolean process = candidateA == null || candidateA.intValue() < 10;
boolean value = candidateA && candidateB;
System.out.print(process || value);
}
public static void main(String[] unused) {
new Q9().calculateResult(null,203);
}