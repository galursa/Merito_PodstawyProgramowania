import java.util.Random;

public class wartoscBezwgledna {
	public static void main(String[] args) {
		// generujemy liczbê i wyœwietlamy wartoœæ bezwzglêdn¹
		//uzywamy operatora ?
		// <-5, 5>    nextInt(11) - 0, 10, nextInt(11) - 5
		Random losuj = new Random();
		int liczba = losuj.nextInt(11)-5;
		System.out.println(liczba);
		/*
		liczba=(liczba<0)?liczba*(-1):liczba;
		System.out.println(liczba);
		*/
		System.out.println((liczba<0)?liczba=liczba*(-1):liczba);
		

	}
}
