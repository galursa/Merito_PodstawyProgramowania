import java.util.Scanner;

public class CzyPelnoletni {
	public static void main(String[] args) {
		//sprawdzamy czy pelnoletni
		Scanner wiek = new Scanner(System.in);
		System.out.println("Podaj wiek");
		int wiekU = wiek.nextInt();
		if (wiekU<18)
		{
			System.out.println("Nie jesteœ pe³noletni");
		}else{
			System.out.println("Jesteœ pe³noletni");
		}
	    
		
	}
}
