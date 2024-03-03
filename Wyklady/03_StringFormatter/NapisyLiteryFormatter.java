import java.util.Formatter;

public class NapisyLiteryFormatter {
	public static void main(String[] args) {
		Formatter napis = new Formatter();
		napis.format("Dzieñ tygodnia: %S, liczba ca³kowita: %d, liczba rzeczywista: %f","Czwartek",23, 3.14);
		System.out.println(napis);
		napis.close();
	}
}
