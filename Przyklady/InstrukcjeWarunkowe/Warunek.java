import java.util.Random;

public class Warunek {
	public static void main(String[] args) {
		//Przyk³ad na warunek
		//Losujemy liczbê i sprawdzamy czy jest podzielna przez 3 i 4 
		int liczba;
		Random rnd = new Random();
		liczba = rnd.nextInt(20)+1;
		if((liczba%3==0)&&(liczba%4==0))
		{
			System.out.println("Liczba: "+liczba+" jest podzielna przez 3 i 4 jednoczeœnie");
		}else if(liczba%3==0)
			System.out.println("Liczba: "+liczba+" jest podzielna przez 3");
		else if (liczba%4==0)
			System.out.println("Liczba: "+liczba+" jest podzielna przez 4");
		else 
			System.out.println("Liczba: "+liczba+" nie dzieli siê ani przez 3 i ani przez 4");
	}
}
