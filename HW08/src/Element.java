class GasException extends Exception {}
class Element {
public int getSymbol() throws GasException { return -1; } // g1
}public class Oxygen extends Element {
public int getSymbol() { return 8; } // g2
public void printData() {
try {
System.out.print(getSymbol());
} catch { // g3
System.out.print("Unable to read data");
}
}
}