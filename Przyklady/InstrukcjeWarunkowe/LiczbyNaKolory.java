import java.util.Random;

public class LiczbyNaKolory {
	public static void main(String[] args) {
		//Losujemy liczbê i zamieniamy na kolor
		Random rnd = new Random();
		int nrKoloru = rnd.nextInt(4)+1;
		switch(nrKoloru) {
		case 1:
			System.out.println("Zielony");
			break;
		case 2:
			System.out.println("Czerwony");
			break;
		case 3:
			System.out.println("Fioletowy");
			break;
		case 4: 
			System.out.println("Czarny");
			break;
		case 5:
			System.out.println("¯ó³ty");
			break;
		default:
			System.out.println("Nieznany wybór");
		}
		
		
	}
}
