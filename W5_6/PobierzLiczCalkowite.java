import java.util.Scanner;

public class PobierzLiczCalkowite {
	public static void main(String[] args) {
		Scanner dane = new Scanner(System.in);
		int suma = 0;
		System.out.println("Prosz� poda� liczby ca�kowite");
		for(int i=0; i<5; i++)
		{
			if(dane.hasNextInt())
			{
				suma+=dane.nextInt();
			}
		}
		System.out.println("Suma ="+suma);
		dane.close();
	}
}
