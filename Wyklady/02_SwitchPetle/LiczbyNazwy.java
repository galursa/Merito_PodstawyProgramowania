import java.util.Random;

public class LiczbyNazwy {
	public static void main(String[] args) {
		int liczba;
		//losujemy liczbê
		Random los = new Random();
		liczba= los.nextInt(4)+1;
		switch(liczba) {
		case 1:
			System.out.println("Jeden");
			break;
		case 2:
			System.out.println("Dwa");
			break;
		case 3:
			System.out.println("Trzy");
			break;
		case 4:
			System.out.println("Cztery");
			break;
		default:
			System.out.println("Nierozpoznany wybór");
			
		}		
	}
}
