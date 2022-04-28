import java.util.Random;

public class IloczynLosowych {
	public static void main(String[] args) {
		/* Losujemy 5 liczb, i sprawdzamy czy ich iloczyn jest wiêkszy od 100 lub mniejszy */
		Random rand = new Random();
		int l1, l2, l3, l4 ,l5;
		l1 = rand.nextInt(10)+1;
		l2 = rand.nextInt(10)+1;
		l3 = rand.nextInt(10)+1;
		l4 = rand.nextInt(10)+1;
		l5 = rand.nextInt(10)+1;
		int iloczyn = l1*l2*l3*l4*l5;
//		int liczba = rand.nextInt(0, l5);
		if(iloczyn>100)
		{
			System.out.println("Iloczyn = "+iloczyn+" jest wiêkszy od 100");
		} else {
			System.out.println("Iloczyn = "+iloczyn+" jest mniejszy lub równy 100");
		}
		
				
	}

}
