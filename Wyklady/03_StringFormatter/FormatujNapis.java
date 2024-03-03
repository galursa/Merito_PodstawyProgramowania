import java.util.Formatter;

public class FormatujNapis {
	public static void main(String[] args) {
		Formatter tekst = new Formatter();
		tekst.format("To jest napis: %s. To jest liczba ca³kowita: %d, a to rzeczywista: %f","blablabla", 20, 3.14);
		System.out.println(tekst);
		tekst.close();
	}
}
