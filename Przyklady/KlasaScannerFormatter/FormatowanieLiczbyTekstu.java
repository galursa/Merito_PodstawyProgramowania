import java.util.Scanner;

public class FormatowanieLiczbyTekstu {
	public static void main(String[] args) {
	//pobieramy od użytkownika liczbę rzeczywistą 
	//i wyświetlamy z dwoma miejscami po przecinku
	//pobieramy od użytkownika wyraz
		double liczba;
		String wyraz;
		Scanner dane = new Scanner(System.in);
		System.out.println("Podaj liczbę rzeczywistą");
		liczba = dane.nextDouble();
		System.out.println("Podaj wyraz");
		wyraz = dane.next();
		System.out.format("Liczba: %1$2.2f, wyraz: %2$s",liczba, wyraz);
		
	}
}
