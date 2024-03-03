import java.util.Random;

public class IleLiczbWTablicy {
	public static void main(String[] args) {
		//losujemy elementy jednowymiarowej tablicy i zliczamy ile razy wystêpuje liczba 3
		int wielkoscTablicy = 30;
		Random los = new Random();
		int tablica[] = new int[wielkoscTablicy];
		int ile=0;
		for(int i=0; i<wielkoscTablicy; i++)
		{
			tablica[i] = los.nextInt(10);
			System.out.print(i+1+" : "+tablica[i]+" | ");
			if(tablica[i]==3)
				ile++;
		}
		System.out.println();
		System.out.println("Liczba 3 wystêpuje:  "+ile+" raz(y)");
		
	}
}
