import java.util.Random;

public class DodawanieTablic {
	public static void main(String[] args) {
		//losujemy dwie dwywymiarowe tablice i sumujemy ich wartoœci
		int wiersze = 3, kolumny = 5;
		int tablica1 [][]= new int[wiersze][kolumny];
		int tablica2 [][]= new int[wiersze][kolumny];
		int sumaTablic [][]= new int[wiersze][kolumny];
		Random rand = new Random();
		for(int i=0; i<wiersze; i++)
		{
			for(int j=0; j<kolumny; j++)
			{
				tablica1[i][j] = rand.nextInt(20);
				tablica2[i][j] = rand.nextInt(20);
				sumaTablic[i][j] = tablica1[i][j]+tablica2[i][j];
			}
		}
		System.out.println("Tablica 1:");
		for(int i=0; i<wiersze; i++)
		{
			for(int j=0; j<kolumny; j++)
			{
				System.out.format("%4d",tablica1[i][j]);
			}
			System.out.println();
		}
		System.out.println("Tablica 2:");
		for(int i=0; i<wiersze; i++)
		{
			for(int j=0; j<kolumny; j++)
			{
				System.out.format("%4d",tablica2[i][j]);
			}
			System.out.println();
		}
		System.out.println("Suma tablic:");
		for(int i=0; i<wiersze; i++)
		{
			for(int j=0; j<kolumny; j++)
			{
				System.out.format("%4d",sumaTablic[i][j]);
			}
			System.out.println();
		}
	}
}
