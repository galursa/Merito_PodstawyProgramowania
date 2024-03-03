import java.util.Random;
import java.util.Scanner;

public class TablicaLosowaZMnozeniem {
	public static void main(String[] args) {
		// Generujemy losowo tablicê dwuwymiarow¹.
		// Pobieramy od u¿ytkownika liczbê.
		// Mno¿ymy elementy tablicy przez tê liczbê.
		double tablicaLiczb[][] = new double[3][4];
		Random los = new Random();
		System.out.println("Losowa tablica:");
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<4; j++)
			{
				tablicaLiczb[i][j]=los.nextDouble();
				System.out.format("%1.3f ",tablicaLiczb[i][j]);
			}
			System.out.println();
		}
		double liczba;
		Scanner dane = new Scanner(System.in);
		System.out.println("Podaj liczbê:");
		liczba = dane.nextDouble();
		System.out.println("Tablica po pomno¿eniu: ");
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<4; j++)
			{
				tablicaLiczb[i][j]*=liczba;//tablicaLiczb[i][j]=tablicaLiczb[i][j]*liczba
				System.out.format("%1.3f ",tablicaLiczb[i][j]);
			}
			System.out.println();
		}
	}
}
