import java.util.Random;

public class Tablica2D {
//Stw�rz tablic� dwuwymiarow�, gdzie rozmiar ka�dego wiersza b�dzie o jeden wi�kszy
// od poprzedniego. Losujemy warto�ci do tablicy.
	public static void main(String[] args) {
		int ileWierszy = 5;
		int ileKolumn;
		int tablica[][] = new int[ileWierszy][];
		Random los = new Random();
		for(int i=0; i<ileWierszy; i++)
		{
			tablica[i]=new int [i+1];	
			for(int j=0; j<tablica[i].length; j++)
			{
				tablica[i][j]= los.nextInt(10);
			}
		}
		for(int i=0; i<ileWierszy; i++)
		{
			for(int j=0; j<tablica[i].length; j++)
			{
				System.out.print(tablica[i][j]+" ");
			}
			System.out.println();
		}
		
	}	
}
