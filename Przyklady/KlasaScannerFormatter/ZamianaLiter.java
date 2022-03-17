import java.util.Scanner;

public class ZamianaLiter {
	public static void main(String[] args) {
		// pobieramy od u¿ytkownika wyraz i zamieniamy pierwsz¹ literê 
		//a pozosta³e zostaj¹ ma³e
		Scanner dane = new Scanner(System.in);
		System.out.println("Podaj wyraz:");
		String wyraz = dane.next();
		String pierwszaLitera = wyraz.substring(0, 1);
		String drugaCzesc = wyraz.substring(1);
		wyraz = pierwszaLitera.toUpperCase();
		wyraz+=drugaCzesc.toLowerCase();
		System.out.println("Poprawiony wyraz: "+wyraz);
		
	}

}
