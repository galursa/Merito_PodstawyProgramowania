import java.util.Random;

public class pêtlaWhileLosujLiczby {
	public static void main(String[] args) {
		// losujemy w pêtli liczby i wyœwietlamy a¿ wylosuje siê liczba wiêksza od 10
		Random los = new Random();
		int liczbaLos = los.nextInt(15);
		while(liczbaLos<=10)
		{
			System.out.print(liczbaLos+" ");
			liczbaLos = los.nextInt(15);
		}	
	}
}
