import java.util.Scanner;

public class CzyPelnoletni {
	public static void main(String[] args) {
		//sprawdzamy czy pelnoletni
		Scanner wiek = new Scanner(System.in);
		System.out.println("Podaj wiek");
		int wiekU = wiek.nextInt();
		if (wiekU<18)
		{
			System.out.println("Nie jeste� pe�noletni");
		}else{
			System.out.println("Jeste� pe�noletni");
		}
	    
		
	}
}
