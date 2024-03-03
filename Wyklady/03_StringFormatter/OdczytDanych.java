import java.util.Scanner;

public class OdczytDanych {
	public static void main(String[] args) {
		Scanner dane = new Scanner(System.in);
		int calkowita;
		float rzeczywista;
		String slowo;
		System.out.println("Podaj liczbê ca³kowit¹");
		calkowita = dane.nextInt();
		System.out.println("Podaj liczbê rzeczywist¹");
		rzeczywista = dane.nextFloat();
		System.out.println("Podaj jakieœ slowo");
		slowo = dane.next();
		System.out.println("Podano nastêpuj¹ce dane");
		System.out.println("Liczba ca³kowita: "+calkowita+", liczba rzeczywista: "+rzeczywista);
		System.out.println("Slowo: "+slowo);
		dane.close();
	}
}
