import java.util.Scanner;

public class TekstOdUzytkownika {
//Odczytujemy tekst od u¿ytkownika
//Wyœwietlamy d³ugoœæ
//I zamieniamy ostatni¹ literê na wielk¹
	public static void main(String[] args) {
		Scanner dane = new Scanner(System.in);
		String tekst;
		System.out.println("Napisz jakiœ tekst.");
		tekst = dane.nextLine();
		int dlugosc = tekst.length();
		System.out.println("D³ugoœæ napisu: "+tekst.length());
		System.out.println("Ostatnia liter: "+tekst.charAt(tekst.length()-1));
		String tekstLewy, tekstPrawy;
		tekstLewy = tekst.substring(0,dlugosc-1);
		tekstPrawy = tekst.substring(dlugosc-1, dlugosc);
		tekstPrawy.toUpperCase();
		//System.out.println(tekstLewy);
		tekst = tekstLewy;
		tekst += tekstPrawy.toUpperCase(); 
		System.out.println(tekst);
		
		
	}
}
