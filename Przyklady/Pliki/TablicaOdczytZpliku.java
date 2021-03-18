import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class TablicaOdczytZpliku {
	public static void main(String[] args) throws FileNotFoundException{
		//generujemy losow¹ tablicê,
		//Zapisujemy j¹ do pliku
		//Odczytujemy z pliku
		//Zapisujemy do tablicy
		int liczbaW = 3;
		int liczbaK = 4;
		int[][] liczby = new int[liczbaW][liczbaK];
		Random losowa = new Random();
		for(int i=0; i<liczbaW; i++)
		{
			for(int j=0; j<liczbaK; j++)
			{
				liczby[i][j]= losowa.nextInt(100); 
				System.out.print(liczby[i][j]+" ");
			}
			System.out.println();
		}
		try {
			FileWriter plikDoZapisu = new FileWriter("macierz.txt");
			plikDoZapisu.write(String.valueOf(liczbaW) );
			plikDoZapisu.write("\n");
			plikDoZapisu.write(String.valueOf(liczbaK));
			plikDoZapisu.write("\n");
			for(int i=0; i<liczbaW; i++)
			{
				for(int j=0; j<liczbaK; j++)
				{
					plikDoZapisu.write(String.valueOf(liczby[i][j]));
					plikDoZapisu.write(" ");
				}
				plikDoZapisu.write("\n");
			}
			plikDoZapisu.close();
		}catch (IOException e)
		{
			System.out.println("Nie mo¿na utworzyæ pliku lub wyst¹pi³ inny b³¹d");
			e.printStackTrace();
		}
		File plik = new File("macierz.txt");
		int wiersze;
		int kolumny;
		Scanner dane = new Scanner(plik);
		wiersze = dane.nextInt();
		kolumny = dane.nextInt();
 	    int[][] noweLiczby = new int[wiersze][kolumny];
 	    int i=0;
 	    System.out.println("Nowa tablica");
 	    while(dane.hasNextLine()&&(i<3))
 	    {

 	    	for(int j=0; j<kolumny; j++)
 	    	{
 	    		noweLiczby[i][j] = dane.nextInt();
 	    		System.out.print(noweLiczby[i][j]+" ");
 	    	}
 	    	System.out.println();
 	    	i++;
 	    }
	}
}
