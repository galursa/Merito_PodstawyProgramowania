import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class RzeczywisteDoPliku {
	public static void main(String[] args) throws IOException{
		//Zapis tablicy z wartoœciami rzeczywistymi i odczyt i zapis do tablicy (jednowymiarowa)
		int rozmiar = 10;
		double liczby[] = new double[rozmiar];
		Random rand = new Random();
		
		for(int i=0; i<rozmiar; i++)
		{
			liczby[i] = rand.nextDouble();
			System.out.println(liczby[i]+" ");
		}
		
		FileWriter plik = new FileWriter("Rzeczywiste.txt");
		plik.write(String.valueOf(rozmiar));
		plik.write("\n");
		for(int i=0; i<rozmiar; i++)
		{
			plik.write(String.valueOf(liczby[i]));
			plik.write("\n");
		}
		plik.close();
		//To do odczytaæ liczbê rzeczywist¹ z pliku bo przy zmianie z int na float nie pozwala na zamianê.
		File plik2 = new File("Rzeczywiste.txt");
		Scanner data = new Scanner(plik2);
		int rozmiarTab2 = data.nextInt();
		double liczba;
		if (data.hasNextDouble()) 
			{liczba = data.nextDouble();
		
		System.out.println(liczba); }
		double liczby2[] = new double [rozmiarTab2];
		int i=0;
		
		System.out.println();
		
		while(data.hasNextLine()&&(i<rozmiarTab2))
		{
			String Num=data.next();
	        liczby2[i] = Double.parseDouble(Num);
			i++;
		}

		for(i=0; i<rozmiarTab2; i++)
		{
			System.out.println(liczby2[i]);
		}
	
		
	}
}
