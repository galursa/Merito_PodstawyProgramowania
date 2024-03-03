import java.util.Formatter;

public class Zagadka {
	public static void main(String[] args) {
		Formatter napis = new Formatter();
		int liczba = 5;
		int lMniej = liczba-1;
		int lJeszczeMniej = liczba - 2;
		napis.format("Mamy %3$d krasnoludków, %2$d butelki i %1$d gruszki.", liczba, lMniej, lJeszczeMniej );
		System.out.print(napis);
	}
}
