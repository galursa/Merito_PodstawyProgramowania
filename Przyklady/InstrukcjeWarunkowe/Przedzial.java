import java.util.Random;

public class Przedzial {
	public static void main(String[] args) {
		/* sprawdziæ czy wylosowana liczba zawiera siê w przedziale <4,10> lub <15,20> */
		Random rand = new Random();
		int liczba = rand.nextInt(25);
		
		if (((liczba>=4)&&(liczba<=10))||((liczba>=15)&&(liczba<=20)))
		{
			System.out.println("Liczba = "+liczba+" zawiera siê w przedziale <4,10> lub <15,20>");
		} else {
			System.out.println("Liczba = "+liczba+" nie zawiera siê w przedziale <4,10> lub <15,20>");
		}
				
	}
}
