import java.util.Random;

public class Warunek {
	public static void main(String[] args) {
		//Przyk�ad na warunek
		//Losujemy liczb� i sprawdzamy czy jest podzielna przez 3 i 4 
		int liczba;
		Random rnd = new Random();
		liczba = rnd.nextInt(20)+1;
		if((liczba%3==0)&&(liczba%4==0))
		{
			System.out.println("Liczba: "+liczba+" jest podzielna przez 3 i 4 jednocze�nie");
		}else if(liczba%3==0)
			System.out.println("Liczba: "+liczba+" jest podzielna przez 3");
		else if (liczba%4==0)
			System.out.println("Liczba: "+liczba+" jest podzielna przez 4");
		else 
			System.out.println("Liczba: "+liczba+" nie dzieli si� ani przez 3 i ani przez 4");
	}
}
