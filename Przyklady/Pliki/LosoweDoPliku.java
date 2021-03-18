import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class LosoweDoPliku {
	public static void main(String[] args) throws FileNotFoundException{
		//Generujemy losowo tablicê 
		//zapisujemy j¹ do pliku
		//Odczytujemy tablicê z pliku i zapisujemy j¹ w tablicy
		int liczbaWierszy = 3;
		int liczbaKolumn = 7;
		int tablica[][] = new int[liczbaWierszy][liczbaKolumn];
		Random los = new Random();
		for(int i=0; i<liczbaWierszy; i++)
		{
			for(int j=0; j<liczbaKolumn; j++)
			{
				tablica[i][j] = los.nextInt(100);
				System.out.print(tablica[i][j]+" ");
			}
			System.out.println();
		}
		try {
			FileWriter plik = new FileWriter("tablica.txt");
			plik.write(String.valueOf(liczbaWierszy));
			plik.write("\n");
			plik.write(String.valueOf(liczbaKolumn));
			plik.write("\n");
			for(int i=0; i<liczbaWierszy; i++)
			{
				for(int j=0; j<liczbaKolumn; j++)
				{
					plik.write(String.valueOf(tablica[i][j]));
					plik.write(" ");
				}
				plik.write("\n");
			}
			plik.close();
			System.out.println("Zapisano do pliku");
			
		}catch(IOException e)
		{
			System.out.println("Wyst¹pi³ b³¹d");
			e.printStackTrace();
		}
		File plik = new File("tablica.txt");
		Scanner dane = new Scanner(plik);
		int liczbaWierszy2 = dane.nextInt();
		int liczbaKolumn2 = dane.nextInt();
		int tablica2[][] = new int[liczbaWierszy2][liczbaKolumn2];
		int i = 0;
		while(dane.hasNextLine()&&(i<liczbaWierszy2))
		{
			for(int j=0; j<liczbaKolumn2; j++)
			{
				tablica2[i][j]= dane.nextInt();
			}
			i++;
		}
		
		for(i=0; i<liczbaWierszy2; i++)
		{
			for(int j=0; j<liczbaKolumn2; j++)
			{
				System.out.print(tablica2[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}
}
