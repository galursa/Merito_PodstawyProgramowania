import java.util.Random;

public class p�tlaWhileLosujLiczby {
	public static void main(String[] args) {
		// losujemy w p�tli liczby i wy�wietlamy a� wylosuje si� liczba wi�ksza od 10
		Random los = new Random();
		int liczbaLos = los.nextInt(15);
		while(liczbaLos<=10)
		{
			System.out.print(liczbaLos+" ");
			liczbaLos = los.nextInt(15);
		}	
	}
}
