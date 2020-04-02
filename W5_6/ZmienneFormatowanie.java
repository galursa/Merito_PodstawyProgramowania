import java.util.Formatter;

public class ZmienneFormatowanie {
	public static void main(String[] args) {
		Formatter napis = new Formatter();
		int liczba1 = 4;
		double pi = 3.14;
		String zdanie = "Bez pracy nie ma ko³aczy";
		napis.format("Liczba ca³kowita: %d,  Liczba rzeczywista: %f, Zdanie: %S",liczba1, pi, zdanie);
		System.out.print(napis);
		napis.close();	
	}
}
