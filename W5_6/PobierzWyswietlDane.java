import java.util.Scanner;

public class PobierzWyswietlDane {
	public static void main(String[] args) {
		Scanner dane  = new Scanner(System.in);
		int liczba;
		for(int i=1; i<=5; i++)
		{
			System.out.printf("Podaj liczbê nr %d: %n",i);
			if (dane.hasNextInt())
			{
				liczba = dane.nextInt();
				System.out.printf("Poda³eœ liczbê %1d :, %2d %n",i, liczba);
			}
		}
		dane.close();
	}
}
