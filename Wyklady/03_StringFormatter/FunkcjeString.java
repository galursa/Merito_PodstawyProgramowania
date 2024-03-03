import java.util.Scanner;

public class FunkcjeString {
	public static void main(String[] args) {
		Scanner wejscie = new Scanner(System.in);
		System.out.println("Podaj pierwsze slowo:");
		String slowo1 = wejscie.next();
		System.out.println("Podaj drugie slowo:");
		String slowo2 = wejscie.next();
		//Sprawdzamy czy d³ugoœæ jest taka sama
		if (slowo1.equals(slowo2) )
		{
			System.out.println("Slowa s¹ takie same");
		}else {
			System.out.println("Slowa s¹ ró¿ne");
		}
		wejscie.close();
	}
}
