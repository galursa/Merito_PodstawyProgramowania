import java.util.Scanner;

public class OdczytDanych {
	public static void main(String[] args) {
		Scanner dane = new Scanner(System.in);
		int calkowita;
		float rzeczywista;
		String slowo;
		System.out.println("Podaj liczb� ca�kowit�");
		calkowita = dane.nextInt();
		System.out.println("Podaj liczb� rzeczywist�");
		rzeczywista = dane.nextFloat();
		System.out.println("Podaj jakie� slowo");
		slowo = dane.next();
		System.out.println("Podano nast�puj�ce dane");
		System.out.println("Liczba ca�kowita: "+calkowita+", liczba rzeczywista: "+rzeczywista);
		System.out.println("Slowo: "+slowo);
		dane.close();
	}
}
